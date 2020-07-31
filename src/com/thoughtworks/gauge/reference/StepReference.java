/*----------------------------------------------------------------
 *  Copyright (c) ThoughtWorks, Inc.
 *  Licensed under the Apache License, Version 2.0
 *  See LICENSE.txt in the project root for license information.
 *----------------------------------------------------------------*/

package com.thoughtworks.gauge.reference;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiReferenceBase;
import com.thoughtworks.gauge.language.psi.SpecStep;
import com.thoughtworks.gauge.util.StepUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.thoughtworks.gauge.util.GaugeUtil.moduleForPsiElement;

public class StepReference extends PsiReferenceBase<SpecStep> {


    public StepReference(@NotNull SpecStep element) {
        super(element);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return StepUtil.findStepImpl(this.myElement, GaugeUtil.moduleForPsiElement(this.myElement));
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public TextRange getRangeInElement() {
        return new TextRange(0, myElement.getTextLength());
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        if (element instanceof PsiMethod) {
            PsiMethod method = (PsiMethod) element;
            return StepUtil.isMatch(method, this.myElement.getStepValue().getStepText(), moduleForPsiElement(element));
        } else {
            return false;
        }
    }

}
