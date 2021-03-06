package org.cruzcampo.gatling.grpc

import io.gatling.core.check.{Check, Extender, Preparer}

object grpc {
  type GrpcCheck = Check[Employee]

  val GrpcStringExtender: Extender[GrpcCheck, Employee] = (check: GrpcCheck) => check

  val GrpcStringPreparer: Preparer[String, String] = (result: String) => Success(result)
}
