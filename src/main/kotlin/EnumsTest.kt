fun kotlinSealedClasses() {
  check(Gravity.TOP == Gravity.safeValueOf("TOP"))
  check(Gravity.top ==  Gravity.safeValueOf("top"))
}
