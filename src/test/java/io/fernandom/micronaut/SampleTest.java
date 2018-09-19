package io.fernandom.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {

  @Test
  public void helloTest() {
    final EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class);
    final RxHttpClient rxHttpClient = RxHttpClient.create(embeddedServer.getURL());

    final HttpRequest request = HttpRequest.GET("/hello");
    final String helloValue = (String) rxHttpClient.retrieve(request).blockingFirst();
    assertEquals("hello", helloValue);
  }

}
