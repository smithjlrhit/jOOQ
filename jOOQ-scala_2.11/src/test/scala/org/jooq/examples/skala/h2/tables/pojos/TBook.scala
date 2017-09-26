/*
 * This file is generated by jOOQ.
*/
package org.jooq.examples.skala.h2.tables.pojos


import java.io.Serializable
import java.lang.Integer
import java.lang.String
import java.lang.StringBuilder
import java.sql.Timestamp

import javax.annotation.Generated

import scala.Array
import scala.Byte


/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.10.0"
  ),
  comments = "This class is generated by jOOQ"
)
class TBook(
    private var id : Integer
  , private var authorId : Integer
  , private var coAuthorId : Integer
  , private var detailsId : Integer
  , private var title : String
  , private var publishedIn : Integer
  , private var languageId : Integer
  , private var contentText : String
  , private var contentPdf : Array[Byte]
  , private var recVersion : Integer
  , private var recTimestamp : Timestamp
) extends Serializable {

  def this() = {
    this(null, null, null, null, null, null, null, null, null, null, null)
  }

  def this (value : TBook) = {
    this(
        value.id
      , value.authorId
      , value.coAuthorId
      , value.detailsId
      , value.title
      , value.publishedIn
      , value.languageId
      , value.contentText
      , value.contentPdf
      , value.recVersion
      , value.recTimestamp
    )
  }

  def getId : Integer = {
    this.id
  }

  def setId(id : Integer) : Unit = {
    this.id = id
  }

  def getAuthorId : Integer = {
    this.authorId
  }

  def setAuthorId(authorId : Integer) : Unit = {
    this.authorId = authorId
  }

  def getCoAuthorId : Integer = {
    this.coAuthorId
  }

  def setCoAuthorId(coAuthorId : Integer) : Unit = {
    this.coAuthorId = coAuthorId
  }

  def getDetailsId : Integer = {
    this.detailsId
  }

  def setDetailsId(detailsId : Integer) : Unit = {
    this.detailsId = detailsId
  }

  def getTitle : String = {
    this.title
  }

  def setTitle(title : String) : Unit = {
    this.title = title
  }

  def getPublishedIn : Integer = {
    this.publishedIn
  }

  def setPublishedIn(publishedIn : Integer) : Unit = {
    this.publishedIn = publishedIn
  }

  def getLanguageId : Integer = {
    this.languageId
  }

  def setLanguageId(languageId : Integer) : Unit = {
    this.languageId = languageId
  }

  def getContentText : String = {
    this.contentText
  }

  def setContentText(contentText : String) : Unit = {
    this.contentText = contentText
  }

  def getContentPdf : Array[Byte] = {
    this.contentPdf
  }

  def setContentPdf(contentPdf : Array[Byte]) : Unit = {
    this.contentPdf = contentPdf
  }

  def getRecVersion : Integer = {
    this.recVersion
  }

  def setRecVersion(recVersion : Integer) : Unit = {
    this.recVersion = recVersion
  }

  def getRecTimestamp : Timestamp = {
    this.recTimestamp
  }

  def setRecTimestamp(recTimestamp : Timestamp) : Unit = {
    this.recTimestamp = recTimestamp
  }

  override def toString : String = {
    val sb = new StringBuilder("TBook (")

    sb.append(id)
    sb.append(", ").append(authorId)
    sb.append(", ").append(coAuthorId)
    sb.append(", ").append(detailsId)
    sb.append(", ").append(title)
    sb.append(", ").append(publishedIn)
    sb.append(", ").append(languageId)
    sb.append(", ").append(contentText)
    sb.append(", ").append("[binary...]")
    sb.append(", ").append(recVersion)
    sb.append(", ").append(recTimestamp)

    sb.append(")");
    return sb.toString
  }
}