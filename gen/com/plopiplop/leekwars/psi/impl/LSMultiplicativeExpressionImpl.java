// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.plopiplop.leekwars.psi.LSTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.plopiplop.leekwars.psi.*;

public class LSMultiplicativeExpressionImpl extends ASTWrapperPsiElement implements LSMultiplicativeExpression {

  public LSMultiplicativeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LSVisitor visitor) {
    visitor.visitMultiplicativeExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LSVisitor) accept((LSVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LSMultiplicativeExpression getMultiplicativeExpression() {
    return findChildByClass(LSMultiplicativeExpression.class);
  }

  @Override
  @NotNull
  public List<LSPrefixExpression> getPrefixExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LSPrefixExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getOpDivide() {
    return findChildByType(OP_DIVIDE);
  }

  @Override
  @Nullable
  public PsiElement getOpModulo() {
    return findChildByType(OP_MODULO);
  }

  @Override
  @Nullable
  public PsiElement getOpPow() {
    return findChildByType(OP_POW);
  }

  @Override
  @Nullable
  public PsiElement getOpTimes() {
    return findChildByType(OP_TIMES);
  }

}
