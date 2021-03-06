/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.declarations.persistent.carriers

import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent
import org.jetbrains.kotlin.ir.declarations.IrField
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction
import org.jetbrains.kotlin.ir.declarations.MetadataSource
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall

// Auto-generated by compiler/ir/ir.tree.persistent/generator/src/org/jetbrains/kotlin/ir/persistentIrGenerator/Main.kt. DO NOT EDIT!

internal interface PropertyCarrier : DeclarationCarrier{
    var backingFieldField: IrField?
    var getterField: IrSimpleFunction?
    var setterField: IrSimpleFunction?
    var metadataField: MetadataSource?
    var attributeOwnerIdField: IrAttributeContainer
    var isExternalField: Boolean

    override fun clone(): PropertyCarrier {
        return PropertyCarrierImpl(
            lastModified,
            parentField,
            originField,
            annotationsField,
            backingFieldField,
            getterField,
            setterField,
            metadataField,
            attributeOwnerIdField,
            isExternalField
        )
    }
}

internal class PropertyCarrierImpl(
    override val lastModified: Int,
    override var parentField: IrDeclarationParent?,
    override var originField: IrDeclarationOrigin,
    override var annotationsField: List<IrConstructorCall>,
    override var backingFieldField: IrField?,
    override var getterField: IrSimpleFunction?,
    override var setterField: IrSimpleFunction?,
    override var metadataField: MetadataSource?,
    override var attributeOwnerIdField: IrAttributeContainer,
    override var isExternalField: Boolean
) : PropertyCarrier
