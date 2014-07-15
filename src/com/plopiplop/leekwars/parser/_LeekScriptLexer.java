/* The following code was generated by JFlex 1.4.3 on 15/07/14 16:36 */

package com.plopiplop.leekwars.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.plopiplop.leekwars.psi.LSTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/07/14 16:36 from the specification file
 * <tt>/Users/bastien/Dev/IntelleekJ/src/com/plopiplop/leekwars/parser/_LeekScriptLexer.flex</tt>
 */
public class _LeekScriptLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\53\1\11"+
    "\2\0\1\41\1\55\1\7\1\43\1\44\1\13\1\37\1\51\1\40"+
    "\1\6\1\12\12\5\1\0\1\42\1\56\1\52\1\57\2\0\32\4"+
    "\1\45\1\10\1\46\1\0\1\4\1\0\1\24\1\30\1\17\1\35"+
    "\1\31\1\14\1\26\1\34\1\21\1\4\1\36\1\27\1\4\1\16"+
    "\1\22\2\4\1\25\1\32\1\20\1\15\1\23\1\33\3\4\1\47"+
    "\1\54\1\50\54\0\1\3\12\0\1\3\4\0\1\3\5\0\27\3"+
    "\1\0\37\3\1\0\u013f\3\31\0\162\3\4\0\14\3\16\0\5\3"+
    "\11\0\1\3\213\0\1\3\13\0\1\3\1\0\3\3\1\0\1\3"+
    "\1\0\24\3\1\0\54\3\1\0\46\3\1\0\5\3\4\0\202\3"+
    "\10\0\105\3\1\0\46\3\2\0\2\3\6\0\20\3\41\0\46\3"+
    "\2\0\1\3\7\0\47\3\110\0\33\3\5\0\3\3\56\0\32\3"+
    "\5\0\13\3\43\0\2\3\1\0\143\3\1\0\1\3\17\0\2\3"+
    "\7\0\2\3\12\0\3\3\2\0\1\3\20\0\1\3\1\0\36\3"+
    "\35\0\3\3\60\0\46\3\13\0\1\3\u0152\0\66\3\3\0\1\3"+
    "\22\0\1\3\7\0\12\3\43\0\10\3\2\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\1\3\3\0\4\3\3\0\1\3\36\0\2\3"+
    "\1\0\3\3\16\0\2\3\23\0\6\3\4\0\2\3\2\0\26\3"+
    "\1\0\7\3\1\0\2\3\1\0\2\3\1\0\2\3\37\0\4\3"+
    "\1\0\1\3\23\0\3\3\20\0\11\3\1\0\3\3\1\0\26\3"+
    "\1\0\7\3\1\0\2\3\1\0\5\3\3\0\1\3\22\0\1\3"+
    "\17\0\2\3\43\0\10\3\2\0\2\3\2\0\26\3\1\0\7\3"+
    "\1\0\2\3\1\0\5\3\3\0\1\3\36\0\2\3\1\0\3\3"+
    "\17\0\1\3\21\0\1\3\1\0\6\3\3\0\3\3\1\0\4\3"+
    "\3\0\2\3\1\0\1\3\1\0\2\3\3\0\2\3\3\0\3\3"+
    "\3\0\10\3\1\0\3\3\113\0\10\3\1\0\3\3\1\0\27\3"+
    "\1\0\12\3\1\0\5\3\46\0\2\3\43\0\10\3\1\0\3\3"+
    "\1\0\27\3\1\0\12\3\1\0\5\3\3\0\1\3\40\0\1\3"+
    "\1\0\2\3\43\0\10\3\1\0\3\3\1\0\27\3\1\0\20\3"+
    "\46\0\2\3\43\0\22\3\3\0\30\3\1\0\11\3\1\0\1\3"+
    "\2\0\7\3\72\0\60\3\1\0\2\3\14\0\7\3\72\0\2\3"+
    "\1\0\1\3\2\0\2\3\1\0\1\3\2\0\1\3\6\0\4\3"+
    "\1\0\7\3\1\0\3\3\1\0\1\3\1\0\1\3\2\0\2\3"+
    "\1\0\4\3\1\0\2\3\11\0\1\3\2\0\5\3\1\0\1\3"+
    "\25\0\2\3\42\0\1\3\77\0\10\3\1\0\42\3\35\0\4\3"+
    "\164\0\42\3\1\0\5\3\1\0\2\3\45\0\6\3\112\0\46\3"+
    "\12\0\51\3\7\0\132\3\5\0\104\3\5\0\122\3\6\0\7\3"+
    "\1\0\77\3\1\0\1\3\1\0\4\3\2\0\7\3\1\0\1\3"+
    "\1\0\4\3\2\0\47\3\1\0\1\3\1\0\4\3\2\0\37\3"+
    "\1\0\1\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3"+
    "\2\0\7\3\1\0\7\3\1\0\27\3\1\0\37\3\1\0\1\3"+
    "\1\0\4\3\2\0\7\3\1\0\47\3\1\0\23\3\105\0\125\3"+
    "\14\0\u026c\3\2\0\10\3\12\0\32\3\5\0\113\3\25\0\15\3"+
    "\1\0\4\3\16\0\22\3\16\0\22\3\16\0\15\3\1\0\3\3"+
    "\17\0\64\3\43\0\1\3\4\0\1\3\103\0\130\3\10\0\51\3"+
    "\127\0\35\3\63\0\36\3\2\0\5\3\u038b\0\154\3\224\0\234\3"+
    "\4\0\132\3\6\0\26\3\2\0\6\3\2\0\46\3\2\0\6\3"+
    "\2\0\10\3\1\0\1\3\1\0\1\3\1\0\1\3\1\0\37\3"+
    "\2\0\65\3\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3"+
    "\3\0\4\3\2\0\6\3\4\0\15\3\5\0\3\3\1\0\7\3"+
    "\164\0\1\3\15\0\1\3\202\0\1\3\4\0\1\3\2\0\12\3"+
    "\1\0\1\3\3\0\5\3\6\0\1\3\1\0\1\3\1\0\1\3"+
    "\1\0\4\3\1\0\3\3\1\0\7\3\3\0\3\3\5\0\5\3"+
    "\u0ebb\0\2\3\52\0\5\3\5\0\2\3\4\0\126\3\6\0\3\3"+
    "\1\0\132\3\1\0\4\3\5\0\50\3\4\0\136\3\21\0\30\3"+
    "\70\0\20\3\u0200\0\u19b6\3\112\0\u51a6\3\132\0\u048d\3\u0773\0\u2ba4\3"+
    "\u215c\0\u012e\3\2\0\73\3\225\0\7\3\14\0\5\3\5\0\1\3"+
    "\1\0\12\3\1\0\15\3\1\0\5\3\1\0\1\3\1\0\2\3"+
    "\1\0\2\3\1\0\154\3\41\0\u016b\3\22\0\100\3\2\0\66\3"+
    "\50\0\14\3\164\0\5\3\1\0\207\3\44\0\32\3\6\0\32\3"+
    "\13\0\131\3\3\0\6\3\2\0\6\3\2\0\6\3\2\0\3\3"+
    "\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\13\3\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\4\1\0\1\30\3\0\1\31\1\0"+
    "\6\3\1\32\6\3\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\0\1\3\1\41\4\3\1\42\5\3\1\43"+
    "\1\44\1\45\3\3\1\46\1\47\3\3\1\50\2\3"+
    "\1\51\3\3\1\52\1\53\2\3\1\54\1\55\2\3"+
    "\1\56\1\3\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\60\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\u0390"+
    "\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\360\0\60"+
    "\0\u04e0\0\u0120\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600"+
    "\0\u0630\0\u0660\0\u0690\0\220\0\u06c0\0\u06f0\0\u0720\0\u0750"+
    "\0\u0780\0\u07b0\0\u07e0\0\u0810\0\60\0\60\0\60\0\60"+
    "\0\u0840\0\u0870\0\220\0\u08a0\0\u08d0\0\u0900\0\u0930\0\220"+
    "\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\60\0\60\0\60"+
    "\0\u0a50\0\u0a80\0\u0ab0\0\220\0\220\0\u0ae0\0\u0b10\0\u0b40"+
    "\0\220\0\u0b70\0\u0ba0\0\220\0\u0bd0\0\u0c00\0\u0c30\0\220"+
    "\0\220\0\u0c60\0\u0c90\0\220\0\220\0\u0cc0\0\u0cf0\0\220"+
    "\0\u0d20\0\220";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\2\4\1\5\1\2\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\4\1\15\1\16"+
    "\1\4\1\17\1\4\1\20\1\21\1\4\1\22\1\23"+
    "\1\4\1\24\3\4\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\61\0\2\3\61\0\2\4"+
    "\6\0\23\4\26\0\1\5\1\46\51\0\7\47\1\50"+
    "\1\51\47\47\10\52\1\53\1\50\46\52\12\0\1\54"+
    "\1\55\50\0\2\4\6\0\1\4\1\56\4\4\1\57"+
    "\1\4\1\60\12\4\25\0\2\4\6\0\2\4\1\61"+
    "\20\4\25\0\2\4\6\0\1\4\1\62\21\4\25\0"+
    "\2\4\6\0\11\4\1\63\11\4\25\0\2\4\6\0"+
    "\1\64\22\4\25\0\2\4\6\0\10\4\1\65\12\4"+
    "\25\0\2\4\6\0\15\4\1\66\5\4\25\0\2\4"+
    "\6\0\13\4\1\67\7\4\25\0\2\4\6\0\11\4"+
    "\1\70\11\4\25\0\2\4\6\0\13\4\1\71\7\4"+
    "\25\0\2\4\6\0\20\4\1\72\2\4\73\0\1\73"+
    "\57\0\1\74\61\0\1\75\60\0\1\76\54\0\1\77"+
    "\57\0\1\100\12\0\1\46\52\0\2\47\1\0\55\47"+
    "\2\52\1\0\55\52\2\54\1\0\55\54\13\55\1\101"+
    "\44\55\4\0\2\4\6\0\2\4\1\102\20\4\25\0"+
    "\2\4\6\0\11\4\1\103\11\4\25\0\2\4\6\0"+
    "\13\4\1\104\7\4\25\0\2\4\6\0\21\4\1\105"+
    "\1\4\25\0\2\4\6\0\13\4\1\106\7\4\25\0"+
    "\2\4\6\0\1\4\1\107\21\4\25\0\2\4\6\0"+
    "\11\4\1\110\11\4\25\0\2\4\6\0\4\4\1\111"+
    "\16\4\25\0\2\4\6\0\6\4\1\112\14\4\25\0"+
    "\2\4\6\0\15\4\1\113\5\4\25\0\2\4\6\0"+
    "\16\4\1\114\4\4\25\0\2\4\6\0\5\4\1\115"+
    "\15\4\73\0\1\116\57\0\1\117\5\0\12\55\1\120"+
    "\45\55\4\0\2\4\6\0\3\4\1\121\17\4\25\0"+
    "\2\4\6\0\16\4\1\122\4\4\25\0\2\4\6\0"+
    "\15\4\1\123\5\4\25\0\2\4\6\0\13\4\1\124"+
    "\7\4\25\0\2\4\6\0\15\4\1\125\5\4\25\0"+
    "\2\4\6\0\1\4\1\126\21\4\25\0\2\4\6\0"+
    "\14\4\1\127\6\4\25\0\2\4\6\0\10\4\1\130"+
    "\12\4\25\0\2\4\6\0\15\4\1\131\5\4\25\0"+
    "\2\4\6\0\13\4\1\132\7\4\25\0\2\4\6\0"+
    "\4\4\1\133\16\4\25\0\2\4\6\0\15\4\1\134"+
    "\5\4\25\0\2\4\6\0\1\135\22\4\25\0\2\4"+
    "\6\0\11\4\1\136\11\4\25\0\2\4\6\0\10\4"+
    "\1\137\12\4\25\0\2\4\6\0\22\4\1\140\25\0"+
    "\2\4\6\0\15\4\1\141\5\4\25\0\2\4\6\0"+
    "\5\4\1\142\15\4\25\0\2\4\6\0\5\4\1\143"+
    "\15\4\25\0\2\4\6\0\2\4\1\144\20\4\25\0"+
    "\2\4\6\0\13\4\1\145\7\4\25\0\2\4\6\0"+
    "\6\4\1\146\14\4\25\0\2\4\6\0\2\4\1\147"+
    "\20\4\25\0\2\4\6\0\2\4\1\150\20\4\25\0"+
    "\2\4\6\0\15\4\1\151\5\4\25\0\2\4\6\0"+
    "\21\4\1\152\1\4\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3408];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\13\1\13\11\7\1\1\0"+
    "\1\11\3\0\1\1\1\0\17\1\4\11\1\0\14\1"+
    "\3\11\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _LeekScriptLexer() {
    this((java.io.Reader)null);
  }


  public _LeekScriptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _LeekScriptLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1222) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 17: 
          { return OP_COMMA;
          }
        case 48: break;
        case 32: 
          { return OP_GE;
          }
        case 49: break;
        case 34: 
          { return KW_VAR;
          }
        case 50: break;
        case 37: 
          { return MULTILINE_COMMENT;
          }
        case 51: break;
        case 23: 
          { return OP_GT;
          }
        case 52: break;
        case 7: 
          { return OP_PLUS;
          }
        case 53: break;
        case 27: 
          { return OP_EQUALS;
          }
        case 54: break;
        case 13: 
          { return OP_LBRACKET;
          }
        case 55: break;
        case 18: 
          { return OP_ASSIGN;
          }
        case 56: break;
        case 43: 
          { return KW_WHILE;
          }
        case 57: break;
        case 20: 
          { return OP_BINARY_OR;
          }
        case 58: break;
        case 4: 
          { return NUMBER;
          }
        case 59: break;
        case 28: 
          { return OP_NOT_EQUALS;
          }
        case 60: break;
        case 9: 
          { return OP_MODULO;
          }
        case 61: break;
        case 45: 
          { return KW_GLOBAL;
          }
        case 62: break;
        case 42: 
          { return KW_BREAK;
          }
        case 63: break;
        case 25: 
          { return COMMENT;
          }
        case 64: break;
        case 46: 
          { return KW_FUNCTION;
          }
        case 65: break;
        case 8: 
          { return OP_MINUS;
          }
        case 66: break;
        case 38: 
          { return KW_NULL;
          }
        case 67: break;
        case 47: 
          { return KW_UNDEFINED;
          }
        case 68: break;
        case 31: 
          { return OP_LE;
          }
        case 69: break;
        case 6: 
          { return OP_TIMES;
          }
        case 70: break;
        case 26: 
          { return KW_IF;
          }
        case 71: break;
        case 5: 
          { return OP_DIVIDE;
          }
        case 72: break;
        case 10: 
          { return OP_SEMICOLON;
          }
        case 73: break;
        case 44: 
          { return KW_RETURN;
          }
        case 74: break;
        case 11: 
          { return OP_LPAREN;
          }
        case 75: break;
        case 22: 
          { return OP_LT;
          }
        case 76: break;
        case 12: 
          { return OP_RPAREN;
          }
        case 77: break;
        case 29: 
          { return OP_LOGICAL_OR;
          }
        case 78: break;
        case 40: 
          { return KW_ELSE;
          }
        case 79: break;
        case 14: 
          { return OP_RBRACKET;
          }
        case 80: break;
        case 39: 
          { return KW_TRUE;
          }
        case 81: break;
        case 24: 
          { return STRING;
          }
        case 82: break;
        case 41: 
          { return KW_FALSE;
          }
        case 83: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 84: break;
        case 15: 
          { return OP_LBRACE;
          }
        case 85: break;
        case 33: 
          { return KW_FOR;
          }
        case 86: break;
        case 3: 
          { return IDENTIFIER;
          }
        case 87: break;
        case 16: 
          { return OP_RBRACE;
          }
        case 88: break;
        case 19: 
          { return OP_NOT;
          }
        case 89: break;
        case 35: 
          { return OP_IDENTITY_EQUALS;
          }
        case 90: break;
        case 36: 
          { return OP_IDENTITY_NOT_EQUALS;
          }
        case 91: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 92: break;
        case 21: 
          { return OP_BINARY_AND;
          }
        case 93: break;
        case 30: 
          { return OP_LOGICAL_AND;
          }
        case 94: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
