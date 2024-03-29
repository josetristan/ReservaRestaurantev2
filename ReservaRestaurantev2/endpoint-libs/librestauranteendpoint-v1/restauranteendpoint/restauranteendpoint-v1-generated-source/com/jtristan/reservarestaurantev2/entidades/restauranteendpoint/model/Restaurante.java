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
 * on 2014-05-23 at 09:06:16 UTC 
 * Modify at your own risk.
 */

package com.jtristan.reservarestaurantev2.entidades.restauranteendpoint.model;

/**
 * Model definition for Restaurante.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the restauranteendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Restaurante extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Carta> carta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Direccion direccion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String estrellas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombre;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Oferta> ofertas;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Carta> getCarta() {
    return carta;
  }

  /**
   * @param carta carta or {@code null} for none
   */
  public Restaurante setCarta(java.util.List<Carta> carta) {
    this.carta = carta;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Direccion getDireccion() {
    return direccion;
  }

  /**
   * @param direccion direccion or {@code null} for none
   */
  public Restaurante setDireccion(Direccion direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEstrellas() {
    return estrellas;
  }

  /**
   * @param estrellas estrellas or {@code null} for none
   */
  public Restaurante setEstrellas(java.lang.String estrellas) {
    this.estrellas = estrellas;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Restaurante setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombre() {
    return nombre;
  }

  /**
   * @param nombre nombre or {@code null} for none
   */
  public Restaurante setNombre(java.lang.String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Oferta> getOfertas() {
    return ofertas;
  }

  /**
   * @param ofertas ofertas or {@code null} for none
   */
  public Restaurante setOfertas(java.util.List<Oferta> ofertas) {
    this.ofertas = ofertas;
    return this;
  }

  @Override
  public Restaurante set(String fieldName, Object value) {
    return (Restaurante) super.set(fieldName, value);
  }

  @Override
  public Restaurante clone() {
    return (Restaurante) super.clone();
  }

}
