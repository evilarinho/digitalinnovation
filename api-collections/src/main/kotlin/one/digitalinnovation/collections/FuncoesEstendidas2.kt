package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria2() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media2() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()