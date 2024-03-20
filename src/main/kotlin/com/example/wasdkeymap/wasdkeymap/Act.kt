package com.example.wasdkeymap.wasdkeymap

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class Act : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog("Hello", "title", null)
    }

    override fun isDumbAware(): Boolean {
        return false
    }
}