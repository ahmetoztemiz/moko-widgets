/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.widgets.old

import dev.icerock.moko.widgets.core.VFC
import dev.icerock.moko.widgets.core.ViewFactoryContext

actual var switchWidgetViewFactory: VFC<SwitchWidget> = { context: ViewFactoryContext,
                                                          widget: SwitchWidget ->
    TODO()
//    val ctx = context.context
//    val dm = ctx.resources.displayMetrics
//    val parent = context.parent
//    val layoutInflater = LayoutInflater.from(ctx)
//    val binding: ItemSwitcherBinding =
//        DataBindingUtil.inflate(layoutInflater, R.layout.item_switcher, parent, false)
//
//    binding.widget = widget
//
//    binding.apply {
//
//        val style = widget.style
//
//        root.layoutParams = ConstraintLayout.LayoutParams(
//            style.size.width.toPlatformSize(dm),
//            style.size.height.toPlatformSize(dm)
//        ).apply {
//            setDpMargins(
//                context.context.resources,
//                marginStart = style.margins.start,
//                marginEnd = style.margins.end,
//                marginTop = style.margins.top,
//                marginBottom = style.margins.bottom
//            )
//        }
//
//        style.switchColor?.let { colorStyle ->
//            val thumbStates = ColorStateList(
//                arrayOf(
//                    intArrayOf(-android.R.attr.state_checked),
//                    intArrayOf(android.R.attr.state_checked)
//                ),
//                colorStyle.colors.let {
//                    intArrayOf(it[0], it[1])
//                }
//            )
//
//            val trackStates = ColorStateList(
//                arrayOf(
//                    intArrayOf(-android.R.attr.state_checked),
//                    intArrayOf(android.R.attr.state_checked)
//                ),
//                colorStyle.colors.let {
//                    intArrayOf(it[2], it[3])
//                }
//            )
//
//            switcher.thumbDrawable.setTintList(thumbStates)
//            switcher.trackDrawable.setTintList(trackStates)
//        }
//
//        label.applyStyle(style.labelTextStyle)
//
//        icon.setImageResource(R.drawable.ic_gift)
//
//        lifecycleOwner = context.lifecycleOwner
//    }
//
//    binding.root
}