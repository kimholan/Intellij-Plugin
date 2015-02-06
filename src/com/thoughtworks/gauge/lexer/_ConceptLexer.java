/* The following code was generated by JFlex 1.4.3 on 2/6/15 10:26 AM */

package com.thoughtworks.gauge.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.thoughtworks.gauge.language.token.ConceptTokenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/6/15 10:26 AM from the specification file
 * <tt>/Users/prateekb/Workspace/gauge/Intellij-Plugin/src/com/thoughtworks/gauge/lexer/_ConceptLexer.flex</tt>
 */
public class _ConceptLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INSTEP = 2;
  public static final int INDYNAMICTABLEITEM = 14;
  public static final int INDYNAMIC = 6;
  public static final int INARG = 4;
  public static final int YYINITIAL = 0;
  public static final int INTABLEBODY = 10;
  public static final int INTABLEBODYROW = 12;
  public static final int INTABLEHEADER = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\11"+
    "\1\6\6\0\1\5\2\0\1\7\16\0\1\10\1\0\1\13\35\0"+
    "\1\12\37\0\1\4\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\0\1\5\1\3"+
    "\4\6\1\7\1\10\1\11\1\1\2\12\1\13\1\14"+
    "\1\2\1\15\1\2\2\3\1\16\1\4\2\17\1\20"+
    "\1\4\1\21\1\22\1\23\2\24\1\5\1\22\1\25"+
    "\1\23\1\26\3\0\1\11\1\0\4\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[50];
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
    "\0\0\0\14\0\30\0\44\0\60\0\74\0\110\0\124"+
    "\0\140\0\154\0\170\0\204\0\140\0\140\0\220\0\234"+
    "\0\250\0\264\0\264\0\264\0\300\0\264\0\314\0\330"+
    "\0\344\0\264\0\360\0\374\0\u0108\0\264\0\u0114\0\264"+
    "\0\264\0\u0120\0\u012c\0\u0138\0\u0144\0\u0150\0\264\0\u015c"+
    "\0\264\0\140\0\154\0\170\0\u0168\0\204\0\u0174\0\170"+
    "\0\u0180\0\264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[50];
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
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\5\11"+
    "\1\20\1\21\1\22\5\20\1\23\1\24\2\20\11\25"+
    "\1\26\1\27\1\25\12\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\33\1\36\5\33\1\37\1\33\4\40\1\41"+
    "\7\40\1\42\1\43\1\44\1\45\1\41\2\42\1\46"+
    "\1\47\1\42\1\50\1\42\12\30\1\31\1\51\1\52"+
    "\1\53\1\54\11\52\2\0\1\54\4\0\1\55\13\0"+
    "\1\55\4\0\1\52\1\53\1\54\1\56\2\52\1\17"+
    "\5\52\1\17\1\57\1\60\11\17\1\20\2\0\5\20"+
    "\2\0\2\20\2\0\1\22\25\0\11\25\1\0\1\27"+
    "\13\25\1\27\1\25\12\30\1\31\1\0\12\30\1\31"+
    "\1\30\1\33\2\0\1\33\1\0\5\33\1\37\1\33"+
    "\2\0\2\35\13\0\1\35\10\0\1\33\2\0\7\33"+
    "\1\37\1\33\1\42\2\0\1\42\1\0\2\42\2\0"+
    "\1\42\1\50\1\42\2\0\2\44\13\0\1\44\10\0"+
    "\1\42\2\0\1\45\1\0\2\42\2\0\1\42\1\50"+
    "\1\42\7\0\1\46\4\0\1\42\2\0\4\42\2\0"+
    "\1\42\1\50\1\42\1\0\1\61\1\62\4\0\1\55"+
    "\6\0\1\60\4\0\1\55\6\0\1\62\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[396];
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
    "\1\0\4\1\1\0\13\1\3\11\1\1\1\11\3\1"+
    "\1\11\3\1\1\11\1\1\2\11\5\1\1\11\1\1"+
    "\1\11\3\0\1\1\1\0\3\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[50];
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
  public _ConceptLexer() {
    this((java.io.Reader)null);
  }


  public _ConceptLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _ConceptLexer(java.io.InputStream in) {
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
    while (i < 48) {
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
        case 4: 
          { yybegin(INTABLEHEADER); return TABLE_HEADER;
          }
        case 23: break;
        case 6: 
          { return COMMENT;
          }
        case 24: break;
        case 10: 
          { yybegin(YYINITIAL); return STEP;
          }
        case 25: break;
        case 14: 
          { yybegin(INSTEP); return DYNAMIC_ARG_END;
          }
        case 26: break;
        case 21: 
          { yybegin(INDYNAMICTABLEITEM); return DYNAMIC_ARG_START;
          }
        case 27: break;
        case 19: 
          { yybegin(INTABLEBODYROW); return TABLE_ROW_VALUE;
          }
        case 28: break;
        case 5: 
          { yybegin(INTABLEBODYROW); return WHITESPACE;
          }
        case 29: break;
        case 17: 
          { yypushback(1); yybegin(YYINITIAL);
          }
        case 30: break;
        case 3: 
          { return DYNAMIC_ARG;
          }
        case 31: break;
        case 20: 
          { yybegin(INTABLEBODY); return NEW_LINE;
          }
        case 32: break;
        case 7: 
          { yybegin(INTABLEHEADER);return TABLE_BORDER;
          }
        case 33: break;
        case 12: 
          { yybegin(INARG); return ARG_START;
          }
        case 34: break;
        case 2: 
          { return ARG;
          }
        case 35: break;
        case 9: 
          { return CONCEPT_HEADING;
          }
        case 36: break;
        case 13: 
          { yybegin(INSTEP); return ARG_END;
          }
        case 37: break;
        case 16: 
          { yybegin(INTABLEHEADER); return TABLE_BORDER;
          }
        case 38: break;
        case 15: 
          { yybegin(INTABLEBODY);return NEW_LINE;
          }
        case 39: break;
        case 18: 
          { yybegin(INTABLEBODYROW); return TABLE_BORDER;
          }
        case 40: break;
        case 8: 
          { yybegin(INSTEP);return STEP_IDENTIFIER;
          }
        case 41: break;
        case 1: 
          { yybegin(INSTEP); return STEP;
          }
        case 42: break;
        case 11: 
          { yybegin(INDYNAMIC); return DYNAMIC_ARG_START;
          }
        case 43: break;
        case 22: 
          { yybegin(INTABLEBODYROW); return DYNAMIC_ARG_END;
          }
        case 44: break;
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
