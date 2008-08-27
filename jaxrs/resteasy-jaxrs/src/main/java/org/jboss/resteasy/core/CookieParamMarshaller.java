package org.jboss.resteasy.core;

import org.jboss.resteasy.specimpl.UriBuilderImpl;
import org.jboss.resteasy.spi.ClientHttpOutput;

import javax.ws.rs.core.Cookie;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class CookieParamMarshaller implements Marshaller
{
   private String cookieName;

   public CookieParamMarshaller(String cookieName)
   {
      this.cookieName = cookieName;
   }

   public String getCookieName()
   {
      return cookieName;
   }

   public void marshall(Object object, UriBuilderImpl uri, ClientHttpOutput output)
   {
      Cookie cookie = null;
      if (object instanceof Cookie) cookie = (Cookie) object;
      else cookie = new Cookie(cookieName, object.toString());

      output.getOutputHeaders().add("Cookie", cookie.toString());

   }
}