import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!loginapplet")
public class loginapplet extends class3 {
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field184;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "g",
      descriptor = "I"
   )
   public static int field185;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field186;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   private String field187;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field188;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "k",
      descriptor = "Lra;"
   )
   private class39 field189;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field190;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "m",
      descriptor = "I"
   )
   public int field191;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public String field192;
   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "o",
      descriptor = "I"
   )
   public static int field193;

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V",
      line = 4
   )
   public final void method21(boolean arg0, String arg1) {
      try {
         if (arg0) {
            this.field187 = (String)null;
         }

         if (!super.field9) {
            super.field9 = true;

            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws?mod=" + this.field187 + "&destination=" + this.field186), "_self");
            } catch (Exception var4) {
            }

         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "loginapplet.F(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "a",
      descriptor = "(ZILjava/lang/Object;)[B",
      line = 25
   )
   public static final byte[] method129(boolean arg0, int arg1, Object arg2) {
      try {
         if (arg2 == null) {
            return null;
         } else if (!(arg2 instanceof byte[])) {
            if (arg1 != 277) {
               return (byte[])null;
            } else if (!(arg2 instanceof class45)) {
               throw new IllegalArgumentException();
            } else {
               class45 var5 = (class45)arg2;
               return var5.method218(50);
            }
         } else {
            byte[] var3 = (byte[])((byte[])arg2);
            return arg0 ? class46.method225(var3, arg1 ^ 877319476) : var3;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "loginapplet.D(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "f",
      descriptor = "(I)V",
      line = 62
   )
   private final void method130(int arg0) {
      try {
         int var2 = class11.field85.method201(-3783).method196(127);
         int var3 = class28.field194.method201(-3783).method196(125);
         if ((null != this.field190 || 1 <= var2 && var2 <= 20) && ~var3 <= -2 && var3 <= 12) {
            class25.field175 = arg0;
            if (null == this.field190) {
               class28.field195 = class11.field85;
               class48.field358 = 1;
               class17.field133 = class11.field85.method196(126);
            } else {
               class48.field358 = 0;
               class28.field195 = class28.field194;
               class17.field133 = class28.field194.method196(126);
            }

            class14.field110 = true;
            (new class10()).method41(-1, this);
         } else {
            class25.field175 = 2;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "loginapplet.H(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "b",
      descriptor = "(IIIII)V",
      line = 95
   )
   private final void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 != 1) {
            this.method19(72);
         }

         class21.method110(3 + arg1, arg2 - -3, -6 + arg3, arg4 + -6, 1118481, 150);
         int var6 = 8 + arg2;
         class49.field360.method4(arg1, arg2);
         class45.field335.method4(arg1, 3 + arg2);
         class26.field181.method4(-6 + arg3 + arg1, arg2 + 3);

         while(var6 < arg2 + arg4 + -8) {
            class8.field72.method5(arg1, var6);
            class20.field140.method5(-3 + arg1 + arg3, var6);
            var6 += 5;
         }

         class45.field335.method4(arg1, -8 + arg4 + arg2);
         class26.field181.method4(-6 + arg3 + arg1, arg2 - (-arg4 + 8));
         class39.field302.method4(arg1, -3 + arg2 - -arg4);
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "loginapplet.K(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "b",
      descriptor = "(B)V",
      line = 122
   )
   public final void method8(byte arg0) {
      try {
         if (class7.field64) {
            class21.method101();
            class33.field206.method5(0, 0);
            class12.method53(class28.method136(true, class41.field320), class20.method96(class41.field320, -127), class11.method49(class41.field320, true), -122);
            class42.method213(class41.field320, -125);
            class25.method123(-61);
            int var2 = 8 / ((64 - arg0) / 48);
            class25.field170.method4(class12.field90, class48.field357);
            if (-1 != ~class25.field175) {
               class41 var3;
               if (-5 == ~class25.field175) {
                  var3 = this.field189.field296;
                  this.method134(var3, 124);
                  if (!class12.field94) {
                     class20.field141.method4(277, 146);
                  } else {
                     class4.field17.method4(277, 146);
                  }
               } else if (3 == class25.field175) {
                  var3 = this.field189.field290;
                  this.method134(var3, -101);
                  if (class12.field94) {
                     class4.field17.method4(277, 146);
                  } else {
                     class20.field141.method4(277, 146);
                  }
               } else if (~class25.field175 != -2) {
                  if (class25.field175 == 2) {
                     if (this.field190 != null) {
                        var3 = this.field189.field303;
                        this.method134(var3, -19);
                     } else {
                        var3 = this.field189.field304;
                        this.method134(var3, -46);
                     }

                     if (class12.field94) {
                        class4.field17.method4(277, 146);
                     } else {
                        class20.field141.method4(277, 146);
                     }
                  } else if (-6 == ~class25.field175) {
                     var3 = this.field189.field305;
                     this.method134(var3, 97);
                  }
               } else {
                  var3 = this.field189.field298;
                  this.method134(var3, -43);
               }
            } else {
               if (this.field190 == null) {
                  this.method131(1, 10, 25, 244, 148);
                  class21.method107(21, 143, 222, 19, 16777215);
                  class21.method107(21, 63, 179, 19, 16777215);
                  class21.method102(20, 142, 224, 21, 0);
                  class21.method102(20, 62, 181, 21, 0);
                  if (-1 == ~class48.field358) {
                     class21.method102(19, 61, 183, 23, 16777215);
                  }

                  if (1 == class48.field358) {
                     class21.method102(19, 141, 226, 23, 16777215);
                  }
               } else {
                  this.method131(1, 10, 60, 244, 69);
                  class21.method107(21, 98, 179, 19, 16777215);
                  class21.method102(20, 97, 181, 21, 0);
                  if (-1 == ~class48.field358) {
                     class21.method102(19, 96, 183, 23, 16777215);
                  }
               }

               if (class41.field320 % 50 < 25) {
                  this.method132((byte)124);
               }

               int var6 = 11184810;
               if (0 == class48.field358) {
                  var6 = 16777215;
               }

               if (this.field190 == null) {
                  class12.field89.method163(this.field189.field293, 25, 45, var6, 0);
                  class12.field89.method163(class28.field194, 23, class34.field223, 0, -1);
                  if (1 != class48.field358) {
                     var6 = 11184810;
                  } else {
                     var6 = 16777215;
                  }

                  class12.field89.method163(this.field189.field299, 25, 125, var6, 0);
                  class12.field89.method163(class25.field172, 23, class29.field199, 0, -1);
               } else {
                  class12.field89.method163(this.field189.field293, 25, 80, var6, 0);
                  class12.field89.method163(class28.field194, 23, 35 + class34.field223, 0, -1);
               }

               if (class12.field94) {
                  class22.field155.method4(277, 146);
               } else {
                  class13.field99.method4(277, 146);
               }
            }

            try {
               class15.field116.method87(0, 17932, class8.field70.getGraphics(), 0);
            } catch (Exception var4) {
               class8.field70.repaint();
            }

         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "loginapplet.E(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "d",
      descriptor = "(B)V",
      line = 277
   )
   public final void method20(byte arg0) {
      try {
         int var49;
         if (!class7.field64) {
            File var2;
            if (!class33.field210) {
               var2 = new File(class13.field106.field282 + "\\cache-" + -444661539 + ".dat");
               if (var2.exists()) {
                  try {
                     class7.field69 = class45.method223(var2, (byte)36);
                     if (class7.field69 != null) {
                        class33.field208 = true;
                     }
                  } catch (Exception var42) {
                  }
               }

               class33.field210 = true;
            }

            if (!class33.field208) {
               if (class11.field86 == null) {
                  try {
                     String var3 = this.getCodeBase().toString();
                     if (var3.substring(0, 5).equalsIgnoreCase("https")) {
                        var3 = var3.substring(5, var3.length());
                        var3 = "http" + var3;
                        if (-1 > ~var3.indexOf("17001")) {
                           var3 = var3.substring(0, var3.indexOf("17001")) + "16001" + var3.substring(5 + var3.indexOf("17001"));
                        }
                     }

                     var2 = null;
                     URL var46 = new URL(var3 + "graphics-" + -444661539 + ".js5?cb=" + (int)(10000.0D * Math.random()));
                     class11.field86 = new DataInputStream(var46.openStream());
                     class7.field69 = new byte[57196];
                  } catch (Exception var41) {
                     class34.field217 = false;
                     this.method21(false, "invalidpack");
                  }
               }

               if (class34.field217 && 57196 > class20.field139) {
                  try {
                     var49 = class11.field86.available();
                     if (~var49 > -1) {
                        throw new EOFException();
                     }

                     if (var49 == 0) {
                        return;
                     }

                     if (~var49 < ~(57196 + -class20.field139)) {
                        var49 = -class20.field139 + 57196;
                     }

                     int var51 = class11.field86.read(class7.field69, class20.field139, var49);
                     if (0 > var51) {
                        throw new EOFException();
                     }

                     if (-1 != ~var51) {
                        class20.field139 += var51;
                        return;
                     }

                     return;
                  } catch (Exception var43) {
                     class34.field217 = false;
                     this.method21(false, "invalidpack");
                  }
               }

               try {
                  class11.field86.close();
               } catch (Exception var40) {
                  throw new RuntimeException(var40.toString());
               }
            }

            byte[] var50;
            try {
               MessageDigest var47 = MessageDigest.getInstance("SHA");
               var47.reset();
               var47.update(class7.field69);
               var50 = var47.digest();
               if (-65 != ~var50[0] || 79 != var50[1] || ~var50[2] != 67 || var50[3] != 84 || 73 != ~var50[4] || ~var50[5] != 30 || 39 != ~var50[6] || 90 != ~var50[7] || ~var50[8] != 66 || var50[9] != -73 || -8 != var50[10] || var50[11] != 60 || ~var50[12] != 79 || -1 != var50[13] || var50[14] != 65 || 57 != var50[15] || var50[16] != 30 || -65 != ~var50[17] || var50[18] != -109 || ~var50[19] != -112) {
                  if (class33.field208) {
                     class33.field208 = false;
                     return;
                  }

                  class34.field217 = false;
                  this.method21(false, "invalidpack");
               }
            } catch (Exception var44) {
               if (class33.field208) {
                  class33.field208 = false;
                  return;
               }

               class34.field217 = false;
               this.method21(false, "invalidpack");
            }

            if (class34.field217) {
               if (!class33.field208) {
                  try {
                     class25.method124(class7.field69.length, new File(class13.field106.field282 + "\\cache-" + -444661539 + ".dat"), class7.field69, -75);
                  } catch (Exception var39) {
                  }
               }

               class14 var48;
               try {
                  var48 = new class14(class7.field69, true, true);
               } catch (Exception var38) {
                  throw new RuntimeException(var38.toString());
               }

               class33.field206 = class22.method113(var48, class7.field59, (byte)122, class4.field24);
               class39.field302 = class22.method113(var48, class7.field59, (byte)121, class16.field125);
               class45.field335 = class22.method113(var48, class7.field59, (byte)-39, class6.field56);
               class8.field72 = class22.method113(var48, class7.field59, (byte)6, class28.field196);
               class26.field181 = class22.method113(var48, class7.field59, (byte)121, class10.field81);
               class20.field140 = class22.method113(var48, class7.field59, (byte)-84, class15.field117);
               class49.field360 = class22.method113(var48, class7.field59, (byte)120, class29.field200);
               class25.field170 = class22.method113(var48, class7.field59, (byte)127, class15.field115);
               class13.field99 = class22.method113(var48, class7.field59, (byte)120, this.field189.field300);
               class20.field141 = class22.method113(var48, class7.field59, (byte)120, this.field189.field294);
               class22.field155 = class22.method113(var48, class7.field59, (byte)-25, this.field189.field292);
               class4.field17 = class22.method113(var48, class7.field59, (byte)-63, this.field189.field291);
               var50 = var48.method228(-45, class16.field122);
               class13 var4 = new class13(var50);
               var4.field105 = -2 + var50.length;
               int var5 = var4.method67((byte)125);
               byte[][] var10 = new byte[var5][];
               int[] var6 = new int[var5];
               int[] var8 = new int[var5];
               var4.field105 = var50.length + -7 + -(var5 * 8);
               var4.field105 += 4;
               int[] var7 = new int[var5];
               int var11 = 1 + (255 & var4.method66(false));

               int var12;
               for(var12 = 0; ~var12 > ~var5; ++var12) {
                  var6[var12] = var4.method67((byte)-32);
               }

               for(var12 = 0; ~var5 < ~var12; ++var12) {
                  var7[var12] = var4.method67((byte)94);
               }

               for(var12 = 0; ~var5 < ~var12; ++var12) {
                  var8[var12] = var4.method67((byte)99);
               }

               int[] var9 = new int[var5];

               for(var12 = 0; var5 > var12; ++var12) {
                  var9[var12] = var4.method67((byte)-96);
               }

               var4.field105 = -(var5 * 8) + (var50.length - 7) - (-1 + var11) * 3;
               int[] var53 = new int[var11];

               int var13;
               for(var13 = 1; var11 > var13; ++var13) {
                  var53[var13] = var4.method61(1740634296);
                  if (-1 == ~var53[var13]) {
                     var53[var13] = 1;
                  }
               }

               var4.field105 = 0;
               var13 = 0;

               while(true) {
                  int var14;
                  int var15;
                  if (var13 >= var5) {
                     byte var52 = 0;

                     for(var14 = 1; var14 < var53.length; ++var14) {
                        if (var53[var14] == 1) {
                           var52 = (byte)var14;
                        }
                     }

                     for(var14 = 0; ~var14 > -257; ++var14) {
                        for(var15 = 0; var10[var14].length > var15; ++var15) {
                           var10[var14][var15] = (byte)(var10[var14][var15] != var52 ? 1 : 0);
                        }
                     }

                     byte[] var54 = new byte[257];

                     for(var15 = 0; var15 < var8.length; ++var15) {
                        var54[var15] = (byte)var8[var15];
                     }

                     var54[256] = (byte)(var7[32] + var9[32]);
                     class12.field89 = new class40(var54, var6, var7, var8, var9, var53, var10);
                     class29.field199 = 142 - -(class12.field89.field261 / 2) + 8;
                     class34.field223 = 62 + class12.field89.field261 / 2 + 8;
                     class3.method11(-15775, 80.0F, 500, 330.0F);
                     class25.field175 = 0;
                     class12.field90 = 274;
                     class7.field64 = true;
                     class48.field357 = 13;
                     break;
                  }

                  var14 = var8[var13];
                  var15 = var9[var13];
                  int var16 = var14 * var15;
                  byte[] var17 = new byte[var16];
                  var10[var13] = var17;
                  int var18 = var4.method66(false);
                  int var19;
                  if (~var18 == -1) {
                     for(var19 = 0; ~var19 > ~var16; ++var19) {
                        var17[var19] = var4.method57(-8897);
                     }
                  } else if (~var18 == -2) {
                     for(var19 = 0; var19 < var14; ++var19) {
                        for(int var20 = 0; ~var15 < ~var20; ++var20) {
                           var17[var19 + var20 * var14] = var4.method57(-8897);
                        }
                     }
                  }

                  ++var13;
               }
            }

            if (!class7.field64) {
               return;
            }
         }

         if (this.field188 != null) {
            try {
               this.getAppletContext().showDocument(new URL(this.getCodeBase(), this.field188), "_self");
            } catch (Exception var37) {
               class25.field175 = 4;
            }

            try {
               class18.method89("manualredirect('" + this.field188 + "')", (byte)-81, this);
            } catch (Throwable var36) {
            }

            this.field188 = null;
         }

         if (class37.field271) {
            try {
               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            } catch (Exception var34) {
               class25.field175 = 4;
            } finally {
               class37.field271 = false;
            }
         }

         if (class34.field215) {
            class44.method216(-47, class8.field70);
            class28.method135(12, class8.field70);
            this.method12(arg0 + 170);
            class34.method156((byte)-111, class8.field70);
            class10.method45((byte)-125, class8.field70);
         }

         if (!class3.field10) {
            class48.field358 = -1;
         }

         if (~class4.field54 <= -1) {
            class17.field128 = class4.field54;
         }

         if (~class13.field100 <= -1) {
            class13.field103 = class13.field100;
         }

         class12.method55(0);
         class32.method151(-21414);

         while(true) {
            do {
               if (!class9.method37((byte)-68)) {
                  if (~class17.field129 == -2) {
                     if (~class3.field11 > -21 || -201 > ~class3.field11 || (this.field190 != null || ~class22.field157 > -63 || 83 < class22.field157) && (null == this.field190 || 97 > class22.field157 || -119 > ~class22.field157)) {
                        if (20 <= class3.field11 && 244 >= class3.field11 && -143 >= ~class22.field157 && 163 >= class22.field157 && null == this.field190) {
                           class14.field110 = true;
                           class28.field195 = class11.field85;
                           class17.field133 = 0;
                           class48.field358 = 1;
                           var49 = 0;

                           while(~class17.field133 > ~class28.field195.method196(125) && ~class3.field11 < ~(23 + var49)) {
                              var49 += class12.field89.method175(class25.field172.method194(class17.field133, 28738));
                              ++class17.field133;
                           }
                        }
                     } else {
                        class14.field110 = true;
                        class28.field195 = class28.field194;
                        class17.field133 = 0;
                        class48.field358 = 0;
                        var49 = 0;

                        while(~class17.field133 > ~class28.field195.method196(126) && ~class3.field11 < ~(var49 + 23)) {
                           var49 += class12.field89.method175(class28.field195.method194(class17.field133, 28738));
                           ++class17.field133;
                        }
                     }

                     if (277 < class3.field11 && class3.field11 < 378 && ~class22.field157 > -173 && ~class22.field157 < -147) {
                        if (-1 == ~class25.field175) {
                           this.method130(arg0 ^ -79);
                        } else {
                           class25.field175 = 0;
                        }
                     }
                  }

                  if (arg0 != -80) {
                     this.field190 = (String)null;
                  }

                  ++class41.field320;
                  class12.field94 = -278 > ~class4.field54 && 378 > class4.field54 && class13.field100 < 172 && ~class13.field100 < -147 || class48.field358 == 2;
                  class9.method34((byte)-27);
                  return;
               }

               if (84 == class45.field334 || class45.field334 == 80) {
                  if (-81 == ~class45.field334 && !class25.field174[81] || 84 == class45.field334 && 2 != class48.field358) {
                     ++class48.field358;
                     class48.field358 %= 3;
                  } else if (-81 == ~class45.field334 && class25.field174[81]) {
                     --class48.field358;
                     if (0 > class48.field358) {
                        class48.field358 = 2;
                     }
                  }

                  class17.field133 = 0;
                  class14.field110 = true;
                  if (0 != class48.field358) {
                     if (~class48.field358 != -2) {
                        if (84 == class45.field334) {
                           if (~class25.field175 == -1 && 2 == class48.field358) {
                              this.method130(arg0 + 81);
                           } else if (~class25.field175 != -2) {
                              class25.field175 = 0;
                           }
                        }
                     } else if (this.field190 == null) {
                        class28.field195 = class11.field85;
                        class17.field133 = class11.field85.method196(124);
                     } else {
                        class48.field358 = 2;
                     }
                  } else {
                     class28.field195 = class28.field194;
                     class17.field133 = class28.field194.method196(126);
                  }
               }

               if (-84 == ~class45.field334 && -3 == ~class48.field358) {
                  if (-1 == ~class25.field175) {
                     this.method130(1);
                  } else if (1 != class25.field175) {
                     class25.field175 = 0;
                  }
               }
            } while(0 != class25.field175);

            if (-3 != ~class48.field358) {
               if (~class45.field334 == -86 && 0 < class28.field195.method196(126) && ~class17.field133 < -1) {
                  var49 = class28.field195.method196(127);
                  if (var49 != class17.field133) {
                     class28.field195.method200(class28.field195.method208(class17.field133, 39, var49), -1 + class17.field133, false);
                  }

                  class28.field195.method204(65, -1 + var49);
                  if (class11.field85 == class28.field195) {
                     class25.field172.method204(65, -1 + var49);
                  }

                  class14.field110 = true;
                  --class17.field133;
               } else if (-102 == ~class45.field334 && -1 > ~class28.field195.method196(127) && ~class17.field133 != ~class28.field195.method196(arg0 ^ -52)) {
                  var49 = class28.field195.method196(127);
                  class28.field195.method200(class28.field195.method208(class17.field133 - -1, arg0 + 132, var49), class17.field133, false);
                  class28.field195.method204(65, -1 + var49);
                  if (class11.field85 == class28.field195) {
                     class25.field172.method204(65, var49 + -1);
                  }
               } else if (class45.field334 != 102) {
                  if (class45.field334 != 103) {
                     if (class11.field85 == class28.field195 && class28.field195.method196(125) < 20 && this.method133(277, class13.field108, false)) {
                        var49 = class28.field195.method196(arg0 + 204);
                        class25.field172.method210((byte)64, 42);
                        if (class17.field133 != var49) {
                           class28.field195.method200(class28.field195.method208(class17.field133, 70, var49), class17.field133 + 1, false);
                           class28.field195.method193(class17.field133, class13.field108, true);
                        } else {
                           class28.field195.method210((byte)64, class13.field108);
                        }

                        ++class17.field133;
                        class14.field110 = true;
                     } else if ((this.method133(277, class13.field108, true) || class13.field108 == 32 || 95 == class13.field108) && class28.field194 == class28.field195 && -13 < ~class28.field195.method196(arg0 + 206)) {
                        var49 = class28.field195.method196(arg0 + 207);
                        if (~class17.field133 != ~var49) {
                           class28.field195.method200(class28.field195.method208(class17.field133, 92, var49), class17.field133 + 1, false);
                           class28.field195.method193(class17.field133, class13.field108, true);
                        } else {
                           class28.field195.method210((byte)64, class13.field108);
                        }

                        class14.field110 = true;
                        ++class17.field133;
                     }
                  } else {
                     class17.field133 = class28.field195.method196(127);
                     class14.field110 = true;
                  }
               } else {
                  class17.field133 = 0;
                  class14.field110 = true;
               }
            }

            if (-97 == ~class45.field334 && -1 > ~class17.field133) {
               class14.field110 = true;
               --class17.field133;
            }

            if (~class45.field334 == -98) {
               ++class17.field133;
               if (class28.field194 != class28.field195) {
                  if (class17.field133 <= class11.field85.method196(125)) {
                     class14.field110 = true;
                  } else {
                     class17.field133 = class11.field85.method196(125);
                  }
               } else if (~class17.field133 >= ~class28.field194.method196(arg0 + 206)) {
                  class14.field110 = true;
               } else {
                  class17.field133 = class28.field194.method196(arg0 + 205);
               }
            }
         }
      } catch (RuntimeException var45) {
         throw class28.method139(var45, "loginapplet.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "e",
      descriptor = "(I)V",
      line = 920
   )
   public final void method19(int arg0) {
      try {
         try {
            int var2 = Integer.parseInt(this.field184);
            if (arg0 <= 30) {
               return;
            }

            if (0 == var2) {
               this.field189 = new class39(class34.field228, class41.field310);
            } else {
               if (var2 != 1) {
                  this.method21(false, "unsupportedlang");
                  return;
               }

               this.field189 = new class39(class41.field314, class48.field345);
            }
         } catch (Exception var3) {
            this.method21(false, "unsupportedlang");
            return;
         }

         if (null != this.field186 && null != this.field192 && this.field187 != null) {
            class8.method32(true);
            class34.method156((byte)-111, class8.field70);
            class10.method45((byte)-118, class8.field70);
         } else {
            this.method21(false, "nodest");
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "loginapplet.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "a",
      descriptor = "(Z)V",
      line = 962
   )
   public final void method10(boolean arg0) {
      try {
         class8.method33(26);
         class29.method141(false);
         class32.method152((byte)-79);
         class21.method103();
         class20.method97((byte)-42);
         class44.method217(-1);
         class14.method76(-27729);
         class41.method205(47);
         class13.method70(32768);
         class12.method56(false);
         class9.method35(0);
         class17.method85((byte)-21);
         class39.method187(arg0);
         class22.method114(123);
         class48.method235(arg0);
         class46.method226(0);
         class33.method153(-90);
         class16.method82((byte)68);
         class35.method166();
         class49.method239(-9248);
         class15.method81(-101);
         class7.method30((byte)114);
         class6.method25(14620);
         class10.method44(9901);
         class1.method2(-124);
         class28.method137(-63);
         class34.method155((byte)-61);
         class45.method220((byte)-118);
         class25.method125(10713);
         class11.method48(false);
         class26.method128(!arg0);
         class19.method93(121);
         class30.method144();
         class4.method22(-17939);
         this.field190 = null;
         this.field184 = null;
         this.field187 = null;
         this.field192 = null;
         this.field188 = null;
         this.field189 = null;
         this.field186 = null;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "loginapplet.G(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "e",
      descriptor = "(B)V",
      line = 1014
   )
   private final void method132(byte arg0) {
      try {
         int var2;
         if (class48.field358 == 0) {
            if (class14.field110) {
               if (class17.field133 == class28.field194.method196(126)) {
                  class4.field27 = class12.field89.method165(class28.field194);
               } else {
                  class4.field27 = class12.field89.method165(class28.field194.method208(0, 77, class17.field133));
               }

               class14.field110 = false;
            }

            var2 = 2 + class4.field27 + 20;
            if (this.field190 != null) {
               class21.method106(var2, 101, var2, 114, 0);
            } else {
               class21.method106(var2, 66, var2, 79, 0);
            }
         } else if (null == this.field190 && class48.field358 == 1) {
            if (class14.field110) {
               if (~class17.field133 == ~class25.field172.method196(124)) {
                  class4.field27 = class12.field89.method165(class25.field172);
               } else {
                  class4.field27 = class12.field89.method165(class25.field172.method208(0, 86, class17.field133));
               }

               class14.field110 = false;
            }

            var2 = class4.field27 + 20 - -2;
            class21.method106(var2, 146, var2, 159, 0);
         }

         if (arg0 <= 85) {
            this.field190 = (String)null;
         }

      } catch (RuntimeException var3) {
         throw class28.method139(var3, "loginapplet.I(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "d",
      descriptor = "(I)V",
      line = 1070
   )
   public final void method17(int arg0) {
      try {
         class28.method135(12, class8.field70);
         if (arg0 <= -22) {
            class13.method69(false);
            class44.method216(-100, class8.field70);
            class37.method176((byte)-63);
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "loginapplet.L(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 1085
   )
   private final boolean method133(int arg0, int arg1, boolean arg2) {
      try {
         if (!class48.method230(arg1, (byte)-84)) {
            if (arg2 && 60 == arg1) {
               return false;
            } else if (arg0 != 277) {
               return false;
            } else {
               for(int var4 = 0; var4 < class4.field15.length; ++var4) {
                  if (~class4.field15[var4] == ~arg1) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "loginapplet.A(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "init",
      descriptor = "()V",
      line = 1118
   )
   public final void init() {
      try {
         if (this.method13((byte)69)) {
            this.field192 = this.getParameter("loginurl");
            this.field186 = this.getParameter("dest");
            this.field190 = this.getParameter("aa");
            this.field187 = this.getParameter("mod");
            this.field184 = this.getParameter("lang");
            this.field191 = 32 + Integer.parseInt(this.getParameter("where"));
            if (-1 >= this.getCodeBase().toString().indexOf("runescape") && ~this.getCodeBase().toString().indexOf("jagex") < 0) {
            }

            (new Thread(new class22(this))).start();
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "loginapplet.init()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!loginapplet",
      name = "a",
      descriptor = "(Lsa;I)V",
      line = 1152
   )
   private final void method134(class41 arg0, int arg1) {
      try {
         int var4 = -73 % ((arg1 - 43) / 40);
         int var3 = class12.field89.method172(arg0, 225);
         this.method131(1, 10, 25, 244, 3 + 23 * var3);
         class12.field89.method157(arg0, 23, 32, 225, 10 + var3 * 20, 16777215, 0, 0, 0, 20);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "loginapplet.J(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }
}
