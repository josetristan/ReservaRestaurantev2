/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-04-15 19:10:39 UTC)
 * on 2014-05-23 at 09:06:33 UTC 
 * Modify at your own risk.
 */

package com.jtristan.reservarestaurantev2.entidades.reservaendpoint;

/**
 * Service definition for Reservaendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ReservaendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Reservaendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the reservaendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "reservaendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Reservaendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Reservaendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getReserva".
   *
   * This request holds the parameters needed by the the reservaendpoint server.  After setting any
   * optional parameters, call the {@link GetReserva#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetReserva getReserva(java.lang.Long id) throws java.io.IOException {
    GetReserva result = new GetReserva(id);
    initialize(result);
    return result;
  }

  public class GetReserva extends ReservaendpointRequest<com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva> {

    private static final String REST_PATH = "reserva/{id}";

    /**
     * Create a request for the method "getReserva".
     *
     * This request holds the parameters needed by the the reservaendpoint server.  After setting any
     * optional parameters, call the {@link GetReserva#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetReserva#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetReserva(java.lang.Long id) {
      super(Reservaendpoint.this, "GET", REST_PATH, null, com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetReserva setAlt(java.lang.String alt) {
      return (GetReserva) super.setAlt(alt);
    }

    @Override
    public GetReserva setFields(java.lang.String fields) {
      return (GetReserva) super.setFields(fields);
    }

    @Override
    public GetReserva setKey(java.lang.String key) {
      return (GetReserva) super.setKey(key);
    }

    @Override
    public GetReserva setOauthToken(java.lang.String oauthToken) {
      return (GetReserva) super.setOauthToken(oauthToken);
    }

    @Override
    public GetReserva setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetReserva) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetReserva setQuotaUser(java.lang.String quotaUser) {
      return (GetReserva) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetReserva setUserIp(java.lang.String userIp) {
      return (GetReserva) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetReserva setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetReserva set(String parameterName, Object value) {
      return (GetReserva) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertReserva".
   *
   * This request holds the parameters needed by the the reservaendpoint server.  After setting any
   * optional parameters, call the {@link InsertReserva#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva}
   * @return the request
   */
  public InsertReserva insertReserva(com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva content) throws java.io.IOException {
    InsertReserva result = new InsertReserva(content);
    initialize(result);
    return result;
  }

  public class InsertReserva extends ReservaendpointRequest<com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva> {

    private static final String REST_PATH = "reserva";

    /**
     * Create a request for the method "insertReserva".
     *
     * This request holds the parameters needed by the the reservaendpoint server.  After setting any
     * optional parameters, call the {@link InsertReserva#execute()} method to invoke the remote
     * operation. <p> {@link InsertReserva#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva}
     * @since 1.13
     */
    protected InsertReserva(com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva content) {
      super(Reservaendpoint.this, "POST", REST_PATH, content, com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva.class);
    }

    @Override
    public InsertReserva setAlt(java.lang.String alt) {
      return (InsertReserva) super.setAlt(alt);
    }

    @Override
    public InsertReserva setFields(java.lang.String fields) {
      return (InsertReserva) super.setFields(fields);
    }

    @Override
    public InsertReserva setKey(java.lang.String key) {
      return (InsertReserva) super.setKey(key);
    }

    @Override
    public InsertReserva setOauthToken(java.lang.String oauthToken) {
      return (InsertReserva) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertReserva setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertReserva) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertReserva setQuotaUser(java.lang.String quotaUser) {
      return (InsertReserva) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertReserva setUserIp(java.lang.String userIp) {
      return (InsertReserva) super.setUserIp(userIp);
    }

    @Override
    public InsertReserva set(String parameterName, Object value) {
      return (InsertReserva) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listReserva".
   *
   * This request holds the parameters needed by the the reservaendpoint server.  After setting any
   * optional parameters, call the {@link ListReserva#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListReserva listReserva() throws java.io.IOException {
    ListReserva result = new ListReserva();
    initialize(result);
    return result;
  }

  public class ListReserva extends ReservaendpointRequest<com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.CollectionResponseReserva> {

    private static final String REST_PATH = "reserva";

    /**
     * Create a request for the method "listReserva".
     *
     * This request holds the parameters needed by the the reservaendpoint server.  After setting any
     * optional parameters, call the {@link ListReserva#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListReserva#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListReserva() {
      super(Reservaendpoint.this, "GET", REST_PATH, null, com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.CollectionResponseReserva.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListReserva setAlt(java.lang.String alt) {
      return (ListReserva) super.setAlt(alt);
    }

    @Override
    public ListReserva setFields(java.lang.String fields) {
      return (ListReserva) super.setFields(fields);
    }

    @Override
    public ListReserva setKey(java.lang.String key) {
      return (ListReserva) super.setKey(key);
    }

    @Override
    public ListReserva setOauthToken(java.lang.String oauthToken) {
      return (ListReserva) super.setOauthToken(oauthToken);
    }

    @Override
    public ListReserva setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListReserva) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListReserva setQuotaUser(java.lang.String quotaUser) {
      return (ListReserva) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListReserva setUserIp(java.lang.String userIp) {
      return (ListReserva) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListReserva setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListReserva setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListReserva set(String parameterName, Object value) {
      return (ListReserva) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeReserva".
   *
   * This request holds the parameters needed by the the reservaendpoint server.  After setting any
   * optional parameters, call the {@link RemoveReserva#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveReserva removeReserva(java.lang.Long id) throws java.io.IOException {
    RemoveReserva result = new RemoveReserva(id);
    initialize(result);
    return result;
  }

  public class RemoveReserva extends ReservaendpointRequest<Void> {

    private static final String REST_PATH = "reserva/{id}";

    /**
     * Create a request for the method "removeReserva".
     *
     * This request holds the parameters needed by the the reservaendpoint server.  After setting any
     * optional parameters, call the {@link RemoveReserva#execute()} method to invoke the remote
     * operation. <p> {@link RemoveReserva#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveReserva(java.lang.Long id) {
      super(Reservaendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveReserva setAlt(java.lang.String alt) {
      return (RemoveReserva) super.setAlt(alt);
    }

    @Override
    public RemoveReserva setFields(java.lang.String fields) {
      return (RemoveReserva) super.setFields(fields);
    }

    @Override
    public RemoveReserva setKey(java.lang.String key) {
      return (RemoveReserva) super.setKey(key);
    }

    @Override
    public RemoveReserva setOauthToken(java.lang.String oauthToken) {
      return (RemoveReserva) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveReserva setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveReserva) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveReserva setQuotaUser(java.lang.String quotaUser) {
      return (RemoveReserva) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveReserva setUserIp(java.lang.String userIp) {
      return (RemoveReserva) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveReserva setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveReserva set(String parameterName, Object value) {
      return (RemoveReserva) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateReserva".
   *
   * This request holds the parameters needed by the the reservaendpoint server.  After setting any
   * optional parameters, call the {@link UpdateReserva#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva}
   * @return the request
   */
  public UpdateReserva updateReserva(com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva content) throws java.io.IOException {
    UpdateReserva result = new UpdateReserva(content);
    initialize(result);
    return result;
  }

  public class UpdateReserva extends ReservaendpointRequest<com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva> {

    private static final String REST_PATH = "reserva";

    /**
     * Create a request for the method "updateReserva".
     *
     * This request holds the parameters needed by the the reservaendpoint server.  After setting any
     * optional parameters, call the {@link UpdateReserva#execute()} method to invoke the remote
     * operation. <p> {@link UpdateReserva#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva}
     * @since 1.13
     */
    protected UpdateReserva(com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva content) {
      super(Reservaendpoint.this, "PUT", REST_PATH, content, com.jtristan.reservarestaurantev2.entidades.reservaendpoint.model.Reserva.class);
    }

    @Override
    public UpdateReserva setAlt(java.lang.String alt) {
      return (UpdateReserva) super.setAlt(alt);
    }

    @Override
    public UpdateReserva setFields(java.lang.String fields) {
      return (UpdateReserva) super.setFields(fields);
    }

    @Override
    public UpdateReserva setKey(java.lang.String key) {
      return (UpdateReserva) super.setKey(key);
    }

    @Override
    public UpdateReserva setOauthToken(java.lang.String oauthToken) {
      return (UpdateReserva) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateReserva setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateReserva) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateReserva setQuotaUser(java.lang.String quotaUser) {
      return (UpdateReserva) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateReserva setUserIp(java.lang.String userIp) {
      return (UpdateReserva) super.setUserIp(userIp);
    }

    @Override
    public UpdateReserva set(String parameterName, Object value) {
      return (UpdateReserva) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Reservaendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Reservaendpoint}. */
    @Override
    public Reservaendpoint build() {
      return new Reservaendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ReservaendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setReservaendpointRequestInitializer(
        ReservaendpointRequestInitializer reservaendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(reservaendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}