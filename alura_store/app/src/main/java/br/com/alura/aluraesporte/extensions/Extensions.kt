package br.com.alura.aluraesporte.extensions

import android.content.Context
import android.widget.Toast
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.formatParaMoedaBrasileira(): String {
    val formatoBrasileiro = DecimalFormat
        .getCurrencyInstance(Locale("pt", "br"))
    return formatoBrasileiro
        .format(this)
}

fun Any.showToast(context: Context, mensagem: String): Toast {
    return Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).apply { show() }
}