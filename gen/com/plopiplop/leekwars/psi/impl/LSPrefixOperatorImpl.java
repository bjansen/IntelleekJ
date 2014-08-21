// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.plopiplop.leekwars.psi.LSPrefixOperator;
import com.plopiplop.leekwars.psi.LSVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.plopiplop.leekwars.psi.LSTypes.OP_EXCLAMATION_MARK;
import static com.plopiplop.leekwars.psi.LSTypes.OP_MINUS;
import static com.plopiplop.leekwars.psi.LSTypes.OP_NOT;

public class LSPrefixOperatorImpl extends ASTWrapperPsiElement implements LSPrefixOperator {

  public LSPrefixOperatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LSVisitor) ((LSVisitor)visitor).visitPrefixOperator(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getOpExclamationMark() {
      return findChildByType(OP_EXCLAMATION_MARK);
  }

  @Override
  @Nullable
  public PsiElement getOpMinus() {
    return findChildByType(OP_MINUS);
  }

  @Override
  @Nullable
  public PsiElement getOpNot() {
    return findChildByType(OP_NOT);
  }

}
