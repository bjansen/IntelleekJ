// This is a generated file. Not intended for manual editing.
package com.plopiplop.leekwars.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LSPrefixExpression extends PsiElement {

  @Nullable
  LSMemberExpression getMemberExpression();

  @Nullable
  LSMethodCall getMethodCall();

  @Nullable
  LSPrefixExpression getPrefixExpression();

  @Nullable
  LSPrefixOperator getPrefixOperator();

  @Nullable
  LSSuffixExpression getSuffixExpression();

}