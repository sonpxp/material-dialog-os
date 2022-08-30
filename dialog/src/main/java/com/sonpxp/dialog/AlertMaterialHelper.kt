package com.sonpxp.dialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.sonpxp.dialog.databinding.*


class AlertMaterialHelper {

    /*---------------select dialog-------------------*/

    companion object {
        @JvmStatic
        fun showYesNoAlert(
            context: Context,
            title: String,
            msg: String,
            textButtonLeft: String? = null,
            textButtonRight: String? = null,
            onAgreeCallback: () -> Unit,
            onCancelCallback: () -> Unit
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusSelectIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    txtDialogTitle.text = title
                    txtDialogTip.text = msg
                    if (textButtonLeft != null) btnSelectCancel.text = textButtonLeft
                    btnSelectOk.setOnClickListener {
                        onAgreeCallback()
                        a.dismiss()
                    }
                    if (textButtonRight != null) btnSelectCancel.text = textButtonRight
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }


        /*---------------select icon dialog-------------------*/
        @JvmStatic
        fun showYesNoIconAlert(
            context: Context,
            icon: Int,
            msg: String,
            textButtonLeft: String? = null,
            textButtonRight: String? = null,
            onAgreeCallback: () -> Unit,
            onCancelCallback: () -> Unit
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusSelectIconIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    imgIcon.setImageResource(icon)
                    txtDialogTip.text = msg
                    if (textButtonLeft != null) btnSelectCancel.text = textButtonLeft
                    btnSelectOk.setOnClickListener {
                        onAgreeCallback()
                        a.dismiss()
                    }
                    if (textButtonRight != null) btnSelectCancel.text = textButtonRight
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }

        /*---------------input ios dialog-------------------*/

        @JvmStatic
        fun showInputAlert(
            context: Context,
            title: String,
            msg: String,
            hint: String? = null,
            textInput: String? = null,
            textButtonLeft: String? = null,
            textButtonRight: String? = null,
            onAgreeCallback: (text: String) -> Unit,
            onCancelCallback: () -> Unit
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusInputIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    txtDialogTitle.text = title
                    txtDialogTip.text = msg

                    if (hint != null) edtInput.hint = hint
                    if (textInput != null) edtInput.setText(textInput)
                    // if (textInput != null) edtInput.text = textInput.toEditable()

                    if (textButtonLeft != null) btnSelectCancel.text = textButtonLeft
                    btnSelectOk.setOnClickListener {
                        onAgreeCallback(edtInput.text.toString())
                        a.dismiss()
                    }

                    if (textButtonRight != null) btnSelectCancel.text = textButtonRight
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }

        /*---------------input icon ios dialog-------------------*/

        @JvmStatic
        fun showInputIconAlert(
            context: Context,
            icon: Int,
            msg: String,
            hint: String? = null,
            textInput: String? = null,
            textButtonLeft: String? = null,
            textButtonRight: String? = null,
            onAgreeCallback: (text: String) -> Unit,
            onCancelCallback: () -> Unit
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusInputIconIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    imgIcon.setImageResource(icon)
                    txtDialogTip.text = msg
                    if (hint != null) edtInput.hint = hint
                    if (textInput != null) edtInput.setText(textInput)

                    if (textButtonLeft != null) btnSelectCancel.text = textButtonLeft
                    btnSelectOk.setOnClickListener {
                        onAgreeCallback(edtInput.text.toString())
                        a.dismiss()
                    }

                    if (textButtonRight != null) btnSelectCancel.text = textButtonRight
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }

        /*---------------show msg ios dialog-------------------*/

        @JvmStatic
        fun showMsgAlert(
            context: Context,
            title: String,
            msg: String,
            textButtonCenter: String? = null,
            onCancelCallback: () -> Unit,
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusMsgIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    txtDialogTitle.text = title
                    txtDialogTip.text = msg
                    if (textButtonCenter != null) btnSelectCancel.text = textButtonCenter
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }

        /*---------------show msg icon ios dialog-------------------*/

        @JvmStatic
        fun showMsgIconAlert(
            context: Context,
            icon: Int,
            msg: String,
            textButtonCenter: String? = null,
            onCancelCallback: () -> Unit,
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusMsgIconIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    imgIcon.setImageResource(icon)
                    txtDialogTip.text = msg
                    if (textButtonCenter != null) btnSelectCancel.text = textButtonCenter
                    btnSelectCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }

        /*---------------cus button menu ios dialog-------------------*/

        /**
         * Incomplete - beta
         * */

        @JvmStatic
        fun showButtonMenuAlert(
            context: Context,
            title: String? = null,
            currentPosition: Int,
            onCancelCallback: () -> Unit
        ) {
            val dialog = MaterialAlertDialogBuilder(context, R.style.PauseDialog)
            val binding =
                CusBottomMenuIosBinding.inflate(LayoutInflater.from(context), null, false)
            dialog.setView(binding.root)
            showDialog(dialog) { a ->
                binding.apply {
                    if (title != null) {
                        txtTitle.text = title
                        txtTitle.visibility = View.VISIBLE
                    }
                    val listButton: MutableList<String> = mutableListOf()
                    listButton.add("SMALL")
                    listButton.add("MEDIUM")
                    listButton.add("HEIGHT")

                    btnCancel.setOnClickListener {
                        onCancelCallback()
                        a.dismiss()
                    }
                }
            }
        }


        /*---------------show dialog-------------------*/
        @JvmStatic
        private fun showDialog(
            dialog: MaterialAlertDialogBuilder,
            callback: (a: AlertDialog) -> Unit,
        ) {
            val attributes: WindowManager.LayoutParams?
            val a: AlertDialog = dialog.create()
            val window: Window? = a.window
            callback(a)
            if (window != null) {
                attributes = window.attributes ?: return
                attributes.windowAnimations = R.style.iOSAnimStyle
                a.show()
            }
        }
    }
}