package lila.plan

import org.joda.time.DateTime

sealed trait CustomerInfo

case class MonthlyCustomerInfo(
  subscription: StripeSubscription,
  nextInvoice: StripeInvoice,
  pastInvoices: List[StripeInvoice]) extends CustomerInfo

case class OneTimeCustomerInfo(
  customer: StripeCustomer,
  subscription: StripeSubscription) extends CustomerInfo
