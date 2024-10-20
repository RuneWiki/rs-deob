package deob;

@ObfuscatedName("gi")
public class class157 {

    @ObfuscatedName("gi.al")
    public boolean field1722;

    @ObfuscatedName("gi.ak")
    public boolean field1703;

    @ObfuscatedName("gi.ax")
    public long field1704;

    @ObfuscatedName("gi.ao")
    public int field1705 = 0;

    @ObfuscatedName("gi.ah")
    public String field1706 = null;

    @ObfuscatedName("gi.ar")
    public int field1707 = 0;

    @ObfuscatedName("gi.ab")
    public boolean field1708;

    @ObfuscatedName("gi.am")
    public byte field1710;

    @ObfuscatedName("gi.av")
    public byte field1724;

    @ObfuscatedName("gi.ag")
    public byte field1711;

    @ObfuscatedName("gi.aa")
    public byte field1701;

    @ObfuscatedName("gi.ap")
    public int field1713;

    @ObfuscatedName("gi.ay")
    public long[] field1702;

    @ObfuscatedName("gi.as")
    public byte[] field1723;

    @ObfuscatedName("gi.aj")
    public int[] field1716;

    @ObfuscatedName("gi.an")
    public int[] field1726;

    @ObfuscatedName("gi.au")
    public int[] field1718;

    @ObfuscatedName("gi.ai")
    public boolean[] field1719;

    @ObfuscatedName("gi.ae")
    public int field1720 = -1;

    @ObfuscatedName("gi.aw")
    public int field1721 = -1;

    @ObfuscatedName("gi.aq")
    public int field1712;

    @ObfuscatedName("gi.az")
    public long[] field1715;

    @ObfuscatedName("gi.at")
    public String[] field1709;

    @ObfuscatedName("gi.af")
    public String[] field1725;

    @ObfuscatedName("gi.ad")
    public class503 field1717;

    public class157(class530 arg0) {
        this.method3037(arg0);
    }

    @ObfuscatedName("gi.ac(IB)V")
    public void method3018(int arg0) {
        if (this.field1722) {
            if (this.field1702 == null) {
                this.field1702 = new long[arg0];
            } else {
                System.arraycopy(this.field1702, 0, this.field1702 = new long[arg0], 0, this.field1713);
            }
        }
        if (this.field1703) {
            if (this.field1709 == null) {
                this.field1709 = new String[arg0];
            } else {
                System.arraycopy(this.field1709, 0, this.field1709 = new String[arg0], 0, this.field1713);
            }
        }
        if (this.field1723 == null) {
            this.field1723 = new byte[arg0];
        } else {
            System.arraycopy(this.field1723, 0, this.field1723 = new byte[arg0], 0, this.field1713);
        }
        if (this.field1726 == null) {
            this.field1726 = new int[arg0];
        } else {
            System.arraycopy(this.field1726, 0, this.field1726 = new int[arg0], 0, this.field1713);
        }
        if (this.field1718 == null) {
            this.field1718 = new int[arg0];
        } else {
            System.arraycopy(this.field1718, 0, this.field1718 = new int[arg0], 0, this.field1713);
        }
        if (this.field1719 == null) {
            this.field1719 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1719, 0, this.field1719 = new boolean[arg0], 0, this.field1713);
        }
    }

    @ObfuscatedName("gi.al(IB)V")
    public void method3020(int arg0) {
        if (this.field1722) {
            if (this.field1715 == null) {
                this.field1715 = new long[arg0];
            } else {
                System.arraycopy(this.field1715, 0, this.field1715 = new long[arg0], 0, this.field1712);
            }
        }
        if (!this.field1703) {
            return;
        }
        if (this.field1725 == null) {
            this.field1725 = new String[arg0];
        } else {
            System.arraycopy(this.field1725, 0, this.field1725 = new String[arg0], 0, this.field1712);
        }
    }

    @ObfuscatedName("gi.ak(Ljava/lang/String;I)I")
    public int method3017(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1713; var2++) {
            if (this.field1709[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gi.ax(IIII)I")
    public int method3021(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1726[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gi.ao(II)Ljava/lang/Integer;")
    public Integer method3022(int arg0) {
        if (this.field1717 == null) {
            return null;
        } else {
            class488 var2 = this.field1717.method8070((long) arg0);
            return var2 != null && var2 instanceof class487 ? Integer.valueOf(((class487) var2).field4855) : null;
        }
    }

    @ObfuscatedName("gi.ah(I)[I")
    public int[] method3023() {
        if (this.field1716 == null) {
            String[] var1 = new String[this.field1713];
            this.field1716 = new int[this.field1713];
            int var2 = 0;
            while (var2 < this.field1713) {
                var1[var2] = this.field1709[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1716[var2] = var2++;
            }
            int[] var3 = this.field1716;
            Statics.method3098(var1, var3, 0, var1.length - 1);
        }
        return this.field1716;
    }

    @ObfuscatedName("gi.ar(JLjava/lang/String;II)V")
    public void method3024(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1722) {
            throw new RuntimeException("");
        } else if (this.field1703 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1702 == null || this.field1713 >= this.field1702.length) || arg1 != null && (this.field1709 == null || this.field1713 >= this.field1709.length)) {
                this.method3018(this.field1713 + 5);
            }
            if (this.field1702 != null) {
                this.field1702[this.field1713] = arg0;
            }
            if (this.field1709 != null) {
                this.field1709[this.field1713] = arg1;
            }
            if (this.field1720 == -1) {
                this.field1720 = this.field1713;
                this.field1723[this.field1713] = 126;
            } else {
                this.field1723[this.field1713] = 0;
            }
            this.field1726[this.field1713] = 0;
            this.field1718[this.field1713] = arg2;
            this.field1719[this.field1713] = false;
            this.field1713++;
            this.field1716 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gi.ab(IB)V")
    public void method3025(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1713) {
            throw new RuntimeException("");
        }
        this.field1713--;
        this.field1716 = null;
        if (this.field1713 == 0) {
            this.field1702 = null;
            this.field1709 = null;
            this.field1723 = null;
            this.field1726 = null;
            this.field1718 = null;
            this.field1719 = null;
            this.field1720 = -1;
            this.field1721 = -1;
            return;
        }
        System.arraycopy(this.field1723, arg0 + 1, this.field1723, arg0, this.field1713 - arg0);
        System.arraycopy(this.field1726, arg0 + 1, this.field1726, arg0, this.field1713 - arg0);
        System.arraycopy(this.field1718, arg0 + 1, this.field1718, arg0, this.field1713 - arg0);
        System.arraycopy(this.field1719, arg0 + 1, this.field1719, arg0, this.field1713 - arg0);
        if (this.field1702 != null) {
            System.arraycopy(this.field1702, arg0 + 1, this.field1702, arg0, this.field1713 - arg0);
        }
        if (this.field1709 != null) {
            System.arraycopy(this.field1709, arg0 + 1, this.field1709, arg0, this.field1713 - arg0);
        }
        this.method3026();
    }

    @ObfuscatedName("gi.am(I)V")
    public void method3026() {
        if (this.field1713 == 0) {
            this.field1720 = -1;
            this.field1721 = -1;
            return;
        }
        this.field1720 = -1;
        this.field1721 = -1;
        int var1 = 0;
        byte var2 = this.field1723[0];
        for (int var3 = 1; var3 < this.field1713; var3++) {
            if (this.field1723[var3] > var2) {
                if (var2 == 125) {
                    this.field1721 = var1;
                }
                var1 = var3;
                var2 = this.field1723[var3];
            } else if (this.field1721 == -1 && this.field1723[var3] == 125) {
                this.field1721 = var3;
            }
        }
        this.field1720 = var1;
        if (this.field1720 != -1) {
            this.field1723[this.field1720] = 126;
        }
    }

    @ObfuscatedName("gi.av(JLjava/lang/String;I)V")
    public void method3033(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1722 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1703 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1715 == null || this.field1712 >= this.field1715.length) || arg1 != null && (this.field1725 == null || this.field1712 >= this.field1725.length)) {
                this.method3020(this.field1712 + 5);
            }
            if (this.field1715 != null) {
                this.field1715[this.field1712] = arg0;
            }
            if (this.field1725 != null) {
                this.field1725[this.field1712] = arg1;
            }
            this.field1712++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gi.ag(II)V")
    public void method3028(int arg0) {
        this.field1712--;
        if (this.field1712 == 0) {
            this.field1715 = null;
            this.field1725 = null;
            return;
        }
        if (this.field1715 != null) {
            System.arraycopy(this.field1715, arg0 + 1, this.field1715, arg0, this.field1712 - arg0);
        }
        if (this.field1725 != null) {
            System.arraycopy(this.field1725, arg0 + 1, this.field1725, arg0, this.field1712 - arg0);
        }
    }

    @ObfuscatedName("gi.aa(IBB)I")
    public int method3052(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1720 == arg0 && (this.field1721 == -1 || this.field1723[this.field1721] < 125)) {
            return -1;
        } else if (this.field1723[arg0] == arg1) {
            return -1;
        } else {
            this.field1723[arg0] = arg1;
            this.method3026();
            return arg0;
        }
    }

    @ObfuscatedName("gi.ap(II)Z")
    public boolean method3030(int arg0) {
        if (this.field1720 == arg0 || this.field1723[arg0] == 126) {
            return false;
        }
        this.field1723[this.field1720] = 125;
        this.field1721 = this.field1720;
        this.field1723[arg0] = 126;
        this.field1720 = arg0;
        return true;
    }

    @ObfuscatedName("gi.ay(IZI)I")
    public int method3031(int arg0, boolean arg1) {
        if (this.field1719[arg0] == arg1) {
            return -1;
        } else {
            this.field1719[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gi.as(IIIIB)I")
    public int method3032(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1726[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1726[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gi.aj(III)Z")
    public boolean method3041(int arg0, int arg1) {
        if (this.field1717 == null) {
            this.field1717 = new class503(4);
        } else {
            class488 var3 = this.field1717.method8070((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class487) {
                    class487 var4 = (class487) var3;
                    if (var4.field4855 == arg1) {
                        return false;
                    }
                    var4.field4855 = arg1;
                    return true;
                }
                var3.method7776();
            }
        }
        this.field1717.method8071(new class487(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gi.an(IIIII)Z")
    public boolean method3034(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1717 == null) {
            this.field1717 = new class503(4);
        } else {
            class488 var10 = this.field1717.method8070((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class487) {
                    class487 var11 = (class487) var10;
                    if ((var11.field4855 & var7) == var9) {
                        return false;
                    }
                    var11.field4855 &= ~var7;
                    var11.field4855 |= var9;
                    return true;
                }
                var10.method7776();
            }
        }
        this.field1717.method8071(new class487(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gi.au(IJ)Z")
    public boolean method3019(int arg0, long arg1) {
        if (this.field1717 == null) {
            this.field1717 = new class503(4);
        } else {
            class488 var4 = this.field1717.method8070((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class486) {
                    class486 var5 = (class486) var4;
                    if (var5.field4854 == arg1) {
                        return false;
                    }
                    var5.field4854 = arg1;
                    return true;
                }
                var4.method7776();
            }
        }
        this.field1717.method8071(new class486(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gi.ai(ILjava/lang/String;B)Z")
    public boolean method3036(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1717 == null) {
            this.field1717 = new class503(4);
        } else {
            class488 var3 = this.field1717.method8070((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class485) {
                    class485 var4 = (class485) var3;
                    if (var4.field4853 instanceof String) {
                        if (arg1.equals(var4.field4853)) {
                            return false;
                        }
                        var4.method7776();
                        this.field1717.method8071(new class485(arg1), var4.field4857);
                        return true;
                    }
                }
                var3.method7776();
            }
        }
        this.field1717.method8071(new class485(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gi.ae(Lul;I)V")
    public void method3037(class530 arg0) {
        int var2 = arg0.method8365();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8365();
        if ((var3 & 0x1) != 0) {
            this.field1722 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1703 = true;
        }
        if (!this.field1722) {
            this.field1702 = null;
            this.field1715 = null;
        }
        if (!this.field1703) {
            this.field1709 = null;
            this.field1725 = null;
        }
        this.field1705 = arg0.method8371();
        this.field1707 = arg0.method8371();
        if (var2 <= 3 && this.field1707 != 0) {
            this.field1707 += 16912800;
        }
        this.field1713 = arg0.method8598();
        this.field1712 = arg0.method8365();
        this.field1706 = arg0.method8588();
        if (var2 >= 4) {
            arg0.method8371();
        }
        this.field1708 = arg0.method8365() == 1;
        this.field1710 = arg0.method8366();
        this.field1724 = arg0.method8366();
        this.field1711 = arg0.method8366();
        this.field1701 = arg0.method8366();
        if (this.field1713 > 0) {
            if (this.field1722 && (this.field1702 == null || this.field1702.length < this.field1713)) {
                this.field1702 = new long[this.field1713];
            }
            if (this.field1703 && (this.field1709 == null || this.field1709.length < this.field1713)) {
                this.field1709 = new String[this.field1713];
            }
            if (this.field1723 == null || this.field1723.length < this.field1713) {
                this.field1723 = new byte[this.field1713];
            }
            if (this.field1726 == null || this.field1726.length < this.field1713) {
                this.field1726 = new int[this.field1713];
            }
            if (this.field1718 == null || this.field1718.length < this.field1713) {
                this.field1718 = new int[this.field1713];
            }
            if (this.field1719 == null || this.field1719.length < this.field1713) {
                this.field1719 = new boolean[this.field1713];
            }
            for (int var4 = 0; var4 < this.field1713; var4++) {
                if (this.field1722) {
                    this.field1702[var4] = arg0.method8573();
                }
                if (this.field1703) {
                    this.field1709[var4] = arg0.method8375();
                }
                this.field1723[var4] = arg0.method8366();
                if (var2 >= 2) {
                    this.field1726[var4] = arg0.method8371();
                }
                if (var2 >= 5) {
                    this.field1718[var4] = arg0.method8598();
                } else {
                    this.field1718[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1719[var4] = arg0.method8365() == 1;
                } else {
                    this.field1719[var4] = false;
                }
            }
            this.method3026();
        }
        if (this.field1712 > 0) {
            if (this.field1722 && (this.field1715 == null || this.field1715.length < this.field1712)) {
                this.field1715 = new long[this.field1712];
            }
            if (this.field1703 && (this.field1725 == null || this.field1725.length < this.field1712)) {
                this.field1725 = new String[this.field1712];
            }
            for (int var5 = 0; var5 < this.field1712; var5++) {
                if (this.field1722) {
                    this.field1715[var5] = arg0.method8573();
                }
                if (this.field1703) {
                    this.field1725[var5] = arg0.method8375();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8598();
        if (var6 <= 0) {
            return;
        }
        this.field1717 = new class503(var6 < 16 ? class318.method3444(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8371();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8371();
                this.field1717.method8071(new class487(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8573();
                this.field1717.method8071(new class486(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8588();
                this.field1717.method8071(new class485(var13), (long) var8);
            }
        }
    }
}
