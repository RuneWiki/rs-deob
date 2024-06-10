import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("passapplet!packet")
public class packet {
   @OriginalMember(
      owner = "passapplet!packet",
      name = "data",
      descriptor = "[B"
   )
   public byte[] data;
   @OriginalMember(
      owner = "passapplet!packet",
      name = "pos",
      descriptor = "I"
   )
   public int pos;
   @OriginalMember(
      owner = "passapplet!packet",
      name = "crctable",
      descriptor = "[I"
   )
   private static int[] crctable = new int[256];
   @OriginalMember(
      owner = "passapplet!packet",
      name = "CRC32_POLYNOMIAL",
      descriptor = "I"
   )
   private static final int CRC32_POLYNOMIAL = -306674912;
   @OriginalMember(
      owner = "passapplet!packet",
      name = "base64enctab",
      descriptor = "[C"
   )
   private char[] base64enctab = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

   @OriginalMember(
      owner = "passapplet!packet",
      name = "<init>",
      descriptor = "()V",
      line = 31
   )
   private packet() {
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "<init>",
      descriptor = "([B)V",
      line = 33
   )
   public packet(byte[] arg0) {
      this.data = arg0;
      this.pos = 0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "p1",
      descriptor = "(I)V",
      line = 41
   )
   public void method1(int arg0) {
      this.data[this.pos++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "p2",
      descriptor = "(I)V",
      line = 45
   )
   public void method2(int arg0) {
      this.data[this.pos++] = (byte)(arg0 >> 8);
      this.data[this.pos++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "ip2",
      descriptor = "(I)V",
      line = 50
   )
   public void ip2(int arg0) {
      this.data[this.pos++] = (byte)arg0;
      this.data[this.pos++] = (byte)(arg0 >> 8);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "p3",
      descriptor = "(I)V",
      line = 55
   )
   public void method3(int arg0) {
      this.data[this.pos++] = (byte)(arg0 >> 16);
      this.data[this.pos++] = (byte)(arg0 >> 8);
      this.data[this.pos++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "p4",
      descriptor = "(I)V",
      line = 61
   )
   public void method4(int arg0) {
      this.data[this.pos++] = (byte)(arg0 >> 24);
      this.data[this.pos++] = (byte)(arg0 >> 16);
      this.data[this.pos++] = (byte)(arg0 >> 8);
      this.data[this.pos++] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "ip4",
      descriptor = "(I)V",
      line = 68
   )
   public void ip4(int arg0) {
      this.data[this.pos++] = (byte)arg0;
      this.data[this.pos++] = (byte)(arg0 >> 8);
      this.data[this.pos++] = (byte)(arg0 >> 16);
      this.data[this.pos++] = (byte)(arg0 >> 24);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "p8",
      descriptor = "(J)V",
      line = 75
   )
   public void method5(long arg0) {
      this.data[this.pos++] = (byte)((int)(arg0 >> 56));
      this.data[this.pos++] = (byte)((int)(arg0 >> 48));
      this.data[this.pos++] = (byte)((int)(arg0 >> 40));
      this.data[this.pos++] = (byte)((int)(arg0 >> 32));
      this.data[this.pos++] = (byte)((int)(arg0 >> 24));
      this.data[this.pos++] = (byte)((int)(arg0 >> 16));
      this.data[this.pos++] = (byte)((int)(arg0 >> 8));
      this.data[this.pos++] = (byte)((int)arg0);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "pjstr",
      descriptor = "(Ljava/lang/String;)V",
      line = 93
   )
   public void pjstr(String arg0) {
      arg0.getBytes(0, arg0.length(), this.data, this.pos);
      this.pos += arg0.length();
      this.data[this.pos++] = 0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "pdata",
      descriptor = "([BII)V",
      line = 98
   )
   public void pdata(byte[] arg0, int arg1, int arg2) {
      for(int var4 = arg1; var4 < arg1 + arg2; ++var4) {
         this.data[this.pos++] = arg0[var4];
      }

   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "pad",
      descriptor = "(I)V",
      line = 102
   )
   public void pad(int arg0) {
      while(this.pos < arg0) {
         this.data[this.pos++] = 0;
      }

   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "moveupdata",
      descriptor = "(I)V",
      line = 106
   )
   public void moveupdata(int arg0) {
      if (arg0 >= this.pos) {
         this.pos = 0;
      } else {
         for(int var2 = arg0; var2 < this.pos; ++var2) {
            this.data[var2 - arg0] = this.data[var2];
         }

         this.pos -= arg0;
      }
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "psize4",
      descriptor = "(I)V",
      line = 112
   )
   public void psize4(int arg0) {
      this.data[this.pos - arg0 - 4] = (byte)(arg0 >> 24);
      this.data[this.pos - arg0 - 3] = (byte)(arg0 >> 16);
      this.data[this.pos - arg0 - 2] = (byte)(arg0 >> 8);
      this.data[this.pos - arg0 - 1] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "psize2",
      descriptor = "(I)V",
      line = 119
   )
   public void psize2(int arg0) {
      this.data[this.pos - arg0 - 2] = (byte)(arg0 >> 8);
      this.data[this.pos - arg0 - 1] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "psize1",
      descriptor = "(I)V",
      line = 124
   )
   public void psize1(int arg0) {
      this.data[this.pos - arg0 - 1] = (byte)arg0;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "psmart",
      descriptor = "(I)V",
      line = 128
   )
   public void psmart(int arg0) {
      if (arg0 < 64 && arg0 >= -64) {
         this.method1(arg0 + 64);
      } else if (arg0 < 16384 && arg0 >= -16384) {
         this.method2(arg0 + 49152);
      } else {
         System.out.println("<font color=red>Error psmart out of range: " + arg0 + "</font>");
      }
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "psmarts",
      descriptor = "(I)V",
      line = 134
   )
   public void psmarts(int arg0) {
      if (arg0 < 128) {
         this.method1(arg0);
      } else if (arg0 < 32768) {
         this.method2(32768 + arg0);
      } else {
         System.out.println("<font color=red>Error psmarts out of range: " + arg0 + "</font>");
      }
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "pstrraw",
      descriptor = "(Ljava/lang/String;)V",
      line = 140
   )
   public void pstrraw(String arg0) {
      this.method4(arg0.length());
      arg0.getBytes(0, arg0.length(), this.data, this.pos);
      this.pos += arg0.length();
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g1",
      descriptor = "()I",
      line = 149
   )
   public int method6() {
      return this.data[this.pos++] & 255;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g1b",
      descriptor = "()B",
      line = 153
   )
   public byte g1b() {
      return this.data[this.pos++];
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g2",
      descriptor = "()I",
      line = 157
   )
   public int method7() {
      this.pos += 2;
      return ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g2b",
      descriptor = "()I",
      line = 162
   )
   public int g2b() {
      this.pos += 2;
      int var1 = ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g3",
      descriptor = "()I",
      line = 169
   )
   public int method8() {
      this.pos += 3;
      return ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g4",
      descriptor = "()I",
      line = 174
   )
   public int method9() {
      this.pos += 4;
      return ((this.data[this.pos - 4] & 255) << 24) + ((this.data[this.pos - 3] & 255) << 16) + ((this.data[this.pos - 2] & 255) << 8) + (this.data[this.pos - 1] & 255);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g8",
      descriptor = "()J",
      line = 179
   )
   public long method10() {
      long var1 = (long)this.method9() & 4294967295L;
      long var3 = (long)this.method9() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "fastgstr",
      descriptor = "()Ljava/lang/String;",
      line = 185
   )
   public String fastgstr() {
      if (this.data[this.pos] == 10) {
         ++this.pos;
         return null;
      } else {
         return this.gstr();
      }
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gstr",
      descriptor = "()Ljava/lang/String;",
      line = 190
   )
   public String gstr() {
      int var1 = this.pos;

      while(this.data[this.pos++] != 10) {
      }

      return new String(this.data, var1, this.pos - var1 - 1);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gstrbyte",
      descriptor = "()[B",
      line = 195
   )
   public byte[] gstrbyte() {
      int var1 = this.pos;

      while(this.data[this.pos++] != 10) {
      }

      byte[] var2 = new byte[this.pos - var1 - 1];

      for(int var3 = var1; var3 < this.pos - 1; ++var3) {
         var2[var3 - var1] = this.data[var3];
      }

      return var2;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gdata",
      descriptor = "([BII)V",
      line = 202
   )
   public void gdata(byte[] arg0, int arg1, int arg2) {
      for(int var4 = arg1; var4 < arg1 + arg2; ++var4) {
         arg0[var4] = this.data[this.pos++];
      }

   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gsmart",
      descriptor = "()I",
      line = 206
   )
   public int gsmart() {
      int var1 = this.data[this.pos] & 255;
      return var1 < 128 ? this.method6() - 64 : this.method7() - 49152;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gsmarts",
      descriptor = "()I",
      line = 211
   )
   public int gsmarts() {
      int var1 = this.data[this.pos] & 255;
      return var1 < 128 ? this.method6() : this.method7() - 32768;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "gstrraw",
      descriptor = "()Ljava/lang/String;",
      line = 217
   )
   public String gstrraw() {
      int var1 = this.method9();
      int var2 = this.pos;
      this.pos += var1;
      return new String(this.data, var2, var1);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "tinyenc",
      descriptor = "([I)V",
      line = 227
   )
   public void tinyenc(int[] arg0) {
      int var2 = this.pos / 8;
      this.pos = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method9();
         int var5 = this.method9();
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 32;

         while(var8-- > 0) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + arg0[var6 & 3];
            var6 += var7;
            var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var6 + arg0[var6 >>> 11 & 3];
         }

         this.pos -= 8;
         this.method4(var4);
         this.method4(var5);
      }

   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "tinydec",
      descriptor = "([I)V",
      line = 241
   )
   public void tinydec(int[] arg0) {
      int var2 = this.pos / 8;
      this.pos = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method9();
         int var5 = this.method9();
         int var6 = -957401312;
         int var7 = -1640531527;
         int var8 = 32;

         while(var8-- > 0) {
            var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ var6 + arg0[var6 >>> 11 & 3];
            var6 -= var7;
            var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + arg0[var6 & 3];
         }

         this.pos -= 8;
         this.method4(var4);
         this.method4(var5);
      }

   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "rsaenc",
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 255
   )
   public void rsaenc(BigInteger arg0, BigInteger arg1) {
      int var3 = this.pos;
      this.pos = 0;
      byte[] var4 = new byte[var3];
      this.gdata(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(arg0, arg1);
      byte[] var7 = var6.toByteArray();
      this.pos = 0;
      this.method1(var7.length);
      this.pdata(var7, 0, var7.length);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "rsadec",
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V",
      line = 264
   )
   public void rsadec(BigInteger arg0, BigInteger arg1) {
      int var3 = this.method6();
      byte[] var4 = new byte[var3];
      this.gdata(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(arg0, arg1);
      byte[] var7 = var6.toByteArray();
      this.pos = 0;
      this.pdata(var7, 0, var7.length);
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "addcrc",
      descriptor = "()I",
      line = 273
   )
   public int addcrc() {
      int var1 = -1;

      for(int var2 = 0; var2 < this.pos; ++var2) {
         var1 = var1 >>> 8 ^ crctable[(var1 ^ this.data[var2]) & 255];
      }

      var1 = ~var1;
      this.method4(var1);
      return var1;
   }

   @OriginalMember(
      owner = "passapplet!packet",
      name = "g64encoded",
      descriptor = "(I)Ljava/lang/String;",
      line = 285
   )
   public String g64encoded(int arg0) {
      String var2 = "";
      int var3 = arg0;
      int var4 = arg0 % 3;
      if (var4 != 0) {
         arg0 += 3 - var4;
      }

      for(int var5 = 0; var5 < arg0; var5 += 3) {
         var2 = var2 + this.base64enctab[this.data[var5 + this.pos] >> 2 & 63];
         if (var5 + 3 > var3) {
            if (var4 == 1) {
               var2 = var2 + this.base64enctab[this.data[var5 + this.pos] << 4 & 48];
               var2 = var2 + "==";
            } else if (var4 == 2) {
               var2 = var2 + this.base64enctab[this.data[var5 + this.pos] << 4 & 48 | this.data[var5 + 1 + this.pos] >> 4 & 15];
               var2 = var2 + this.base64enctab[this.data[var5 + 1 + this.pos] << 2 & 60];
               var2 = var2 + "=";
            }
         } else {
            var2 = var2 + this.base64enctab[this.data[var5 + this.pos] << 4 & 48 | this.data[var5 + 1 + this.pos] >> 4 & 15];
            var2 = var2 + this.base64enctab[this.data[var5 + 1 + this.pos] << 2 & 60 | this.data[var5 + 2 + this.pos] >> 6 & 3];
            var2 = var2 + this.base64enctab[this.data[var5 + 2 + this.pos] & 63];
         }
      }

      return var2;
   }

   static {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         crctable[var1] = var0;
      }

   }
}
