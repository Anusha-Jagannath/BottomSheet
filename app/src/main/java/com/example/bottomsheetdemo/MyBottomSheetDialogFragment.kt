package com.example.bottomsheetdemo


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_demo2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputText = view.findViewById<EditText>(R.id.input_text)
        val submitButton = view.findViewById<Button>(R.id.submit_button)

        // Handle button click
        submitButton.setOnClickListener {
            val input = inputText.text.toString()
            if (input.isNotEmpty()) {
                // Do something with the input text (showing a toast in this case)
                Toast.makeText(context, "Input: $input", Toast.LENGTH_SHORT).show()
                dismiss() // Close the bottom sheet
            } else {
                Toast.makeText(context, "Please enter some text", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
