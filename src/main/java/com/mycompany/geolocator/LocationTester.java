package com.mycompany.geolocator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

/**
 * Implementation class for GeoLocator Interface. LocationTester is used to test
 * the HTTP client connection.
 *
 * @author intern
 */
public class LocationTester implements GeoLocator {

    /**
     * This method is used to provide the HTTP connection for the given
     * ipAddress.
     *
     * @param ip ipAddress is passed as a parameter for locate the place.
     * @return location.
     */
    @Override
    public Location locator(String ip) {

        /**
         * Create a HTTP client connection for establishment.
         */
        HttpClient client = new HttpClient();

        /**
         * An ipAddress is passed as a parameter to GET method.
         */
        GetMethod method = new GetMethod("http://freegeoip.net/xml/");

        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));

        try {
            // Execute the method.
            int statusCode = client.executeMethod(method);

            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + method.getStatusLine());
            }
        } catch (HttpException e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(LocationTester.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Release the connection.
            method.releaseConnection();
        }

        return null;
    }

}
