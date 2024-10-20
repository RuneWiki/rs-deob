package deob;

@ObfuscatedName("fj")
public class class151 {

    @ObfuscatedName("fj.an")
    public boolean field1722;

    @ObfuscatedName("fj.aw")
    public boolean field1711;

    @ObfuscatedName("fj.ac")
    public long field1730;

    @ObfuscatedName("fj.au")
    public int field1713 = 0;

    @ObfuscatedName("fj.ab")
    public String field1714 = null;

    @ObfuscatedName("fj.aq")
    public int field1715 = 0;

    @ObfuscatedName("fj.al")
    public boolean field1716;

    @ObfuscatedName("fj.at")
    public byte field1729;

    @ObfuscatedName("fj.aa")
    public byte field1718;

    @ObfuscatedName("fj.ay")
    public byte field1719;

    @ObfuscatedName("fj.ao")
    public byte field1710;

    @ObfuscatedName("fj.ax")
    public int field1721;

    @ObfuscatedName("fj.ai")
    public long[] field1717;

    @ObfuscatedName("fj.ag")
    public byte[] field1723;

    @ObfuscatedName("fj.ah")
    public int[] field1724;

    @ObfuscatedName("fj.av")
    public int[] field1727;

    @ObfuscatedName("fj.ar")
    public int[] field1726;

    @ObfuscatedName("fj.am")
    public boolean[] field1735;

    @ObfuscatedName("fj.as")
    public int field1728 = -1;

    @ObfuscatedName("fj.aj")
    public int field1734 = -1;

    @ObfuscatedName("fj.ak")
    public int field1712;

    @ObfuscatedName("fj.az")
    public long[] field1731;

    @ObfuscatedName("fj.ad")
    public String[] field1732;

    @ObfuscatedName("fj.ae")
    public String[] field1733;

    @ObfuscatedName("fj.ap")
    public class464 field1720;

    public class151(class489 arg0) {
        this.method3099(arg0);
    }

    @ObfuscatedName("fj.af(II)V")
    public void method3115(int arg0) {
        if (this.field1722) {
            if (this.field1717 == null) {
                this.field1717 = new long[arg0];
            } else {
                System.arraycopy(this.field1717, 0, this.field1717 = new long[arg0], 0, this.field1721);
            }
        }
        if (this.field1711) {
            if (this.field1732 == null) {
                this.field1732 = new String[arg0];
            } else {
                System.arraycopy(this.field1732, 0, this.field1732 = new String[arg0], 0, this.field1721);
            }
        }
        if (this.field1723 == null) {
            this.field1723 = new byte[arg0];
        } else {
            System.arraycopy(this.field1723, 0, this.field1723 = new byte[arg0], 0, this.field1721);
        }
        if (this.field1727 == null) {
            this.field1727 = new int[arg0];
        } else {
            System.arraycopy(this.field1727, 0, this.field1727 = new int[arg0], 0, this.field1721);
        }
        if (this.field1726 == null) {
            this.field1726 = new int[arg0];
        } else {
            System.arraycopy(this.field1726, 0, this.field1726 = new int[arg0], 0, this.field1721);
        }
        if (this.field1735 == null) {
            this.field1735 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1735, 0, this.field1735 = new boolean[arg0], 0, this.field1721);
        }
    }

    @ObfuscatedName("fj.an(IB)V")
    public void method3084(int arg0) {
        if (this.field1722) {
            if (this.field1731 == null) {
                this.field1731 = new long[arg0];
            } else {
                System.arraycopy(this.field1731, 0, this.field1731 = new long[arg0], 0, this.field1712);
            }
        }
        if (!this.field1711) {
            return;
        }
        if (this.field1733 == null) {
            this.field1733 = new String[arg0];
        } else {
            System.arraycopy(this.field1733, 0, this.field1733 = new String[arg0], 0, this.field1712);
        }
    }

    @ObfuscatedName("fj.aw(Ljava/lang/String;B)I")
    public int method3082(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1721; var2++) {
            if (this.field1732[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fj.ac(IIIB)I")
    public int method3083(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1727[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fj.au(IB)Ljava/lang/Integer;")
    public Integer method3133(int arg0) {
        if (this.field1720 == null) {
            return null;
        } else {
            class449 var2 = this.field1720.method7945((long) arg0);
            return var2 != null && var2 instanceof class448 ? Integer.valueOf(((class448) var2).field4744) : null;
        }
    }

    @ObfuscatedName("fj.ab(B)[I")
    public int[] method3085() {
        if (this.field1724 == null) {
            String[] var1 = new String[this.field1721];
            this.field1724 = new int[this.field1721];
            int var2 = 0;
            while (var2 < this.field1721) {
                var1[var2] = this.field1732[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1724[var2] = var2++;
            }
            int[] var3 = this.field1724;
            class486.method3034(var1, var3, 0, var1.length - 1);
        }
        return this.field1724;
    }

    @ObfuscatedName("fj.aq(JLjava/lang/String;II)V")
    public void method3079(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1722) {
            throw new RuntimeException("");
        } else if (this.field1711 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1717 == null || this.field1721 >= this.field1717.length) || arg1 != null && (this.field1732 == null || this.field1721 >= this.field1732.length)) {
                this.method3115(this.field1721 + 5);
            }
            if (this.field1717 != null) {
                this.field1717[this.field1721] = arg0;
            }
            if (this.field1732 != null) {
                this.field1732[this.field1721] = arg1;
            }
            if (this.field1728 == -1) {
                this.field1728 = this.field1721;
                this.field1723[this.field1721] = 126;
            } else {
                this.field1723[this.field1721] = 0;
            }
            this.field1727[this.field1721] = 0;
            this.field1726[this.field1721] = arg2;
            this.field1735[this.field1721] = false;
            this.field1721++;
            this.field1724 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fj.al(IB)V")
    public void method3087(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1721) {
            throw new RuntimeException("");
        }
        this.field1721--;
        this.field1724 = null;
        if (this.field1721 == 0) {
            this.field1717 = null;
            this.field1732 = null;
            this.field1723 = null;
            this.field1727 = null;
            this.field1726 = null;
            this.field1735 = null;
            this.field1728 = -1;
            this.field1734 = -1;
            return;
        }
        System.arraycopy(this.field1723, arg0 + 1, this.field1723, arg0, this.field1721 - arg0);
        System.arraycopy(this.field1727, arg0 + 1, this.field1727, arg0, this.field1721 - arg0);
        System.arraycopy(this.field1726, arg0 + 1, this.field1726, arg0, this.field1721 - arg0);
        System.arraycopy(this.field1735, arg0 + 1, this.field1735, arg0, this.field1721 - arg0);
        if (this.field1717 != null) {
            System.arraycopy(this.field1717, arg0 + 1, this.field1717, arg0, this.field1721 - arg0);
        }
        if (this.field1732 != null) {
            System.arraycopy(this.field1732, arg0 + 1, this.field1732, arg0, this.field1721 - arg0);
        }
        this.method3088();
    }

    @ObfuscatedName("fj.at(I)V")
    public void method3088() {
        if (this.field1721 == 0) {
            this.field1728 = -1;
            this.field1734 = -1;
            return;
        }
        this.field1728 = -1;
        this.field1734 = -1;
        int var1 = 0;
        byte var2 = this.field1723[0];
        for (int var3 = 1; var3 < this.field1721; var3++) {
            if (this.field1723[var3] > var2) {
                if (var2 == 125) {
                    this.field1734 = var1;
                }
                var1 = var3;
                var2 = this.field1723[var3];
            } else if (this.field1734 == -1 && this.field1723[var3] == 125) {
                this.field1734 = var3;
            }
        }
        this.field1728 = var1;
        if (this.field1728 != -1) {
            this.field1723[this.field1728] = 126;
        }
    }

    @ObfuscatedName("fj.aa(JLjava/lang/String;I)V")
    public void method3089(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1722) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1711) {
            if (arg0 > 0L && (this.field1731 == null || this.field1712 >= this.field1731.length) || arg1 != null && (this.field1733 == null || this.field1712 >= this.field1733.length)) {
                this.method3084(this.field1712 + 5);
            }
            if (this.field1731 != null) {
                this.field1731[this.field1712] = arg0;
            }
            if (this.field1733 != null) {
                this.field1733[this.field1712] = arg1;
            }
            this.field1712++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fj.ay(II)V")
    public void method3090(int arg0) {
        this.field1712--;
        if (this.field1712 == 0) {
            this.field1731 = null;
            this.field1733 = null;
            return;
        }
        if (this.field1731 != null) {
            System.arraycopy(this.field1731, arg0 + 1, this.field1731, arg0, this.field1712 - arg0);
        }
        if (this.field1733 != null) {
            System.arraycopy(this.field1733, arg0 + 1, this.field1733, arg0, this.field1712 - arg0);
        }
    }

    @ObfuscatedName("fj.ao(IBI)I")
    public int method3104(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1728 == arg0 && (this.field1734 == -1 || this.field1723[this.field1734] < 125)) {
            return -1;
        } else if (this.field1723[arg0] == arg1) {
            return -1;
        } else {
            this.field1723[arg0] = arg1;
            this.method3088();
            return arg0;
        }
    }

    @ObfuscatedName("fj.ax(IB)Z")
    public boolean method3081(int arg0) {
        if (this.field1728 == arg0 || this.field1723[arg0] == 126) {
            return false;
        }
        this.field1723[this.field1728] = 125;
        this.field1734 = this.field1728;
        this.field1723[arg0] = 126;
        this.field1728 = arg0;
        return true;
    }

    @ObfuscatedName("fj.ai(IZS)I")
    public int method3093(int arg0, boolean arg1) {
        if (this.field1735[arg0] == arg1) {
            return -1;
        } else {
            this.field1735[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fj.ag(IIIII)I")
    public int method3103(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1727[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1727[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fj.ah(III)Z")
    public boolean method3095(int arg0, int arg1) {
        if (this.field1720 == null) {
            this.field1720 = new class464(4);
        } else {
            class449 var3 = this.field1720.method7945((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class448) {
                    class448 var4 = (class448) var3;
                    if (var4.field4744 == arg1) {
                        return false;
                    }
                    var4.field4744 = arg1;
                    return true;
                }
                var3.method7651();
            }
        }
        this.field1720.method7946(new class448(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fj.av(IIIII)Z")
    public boolean method3096(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1720 == null) {
            this.field1720 = new class464(4);
        } else {
            class449 var10 = this.field1720.method7945((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class448) {
                    class448 var11 = (class448) var10;
                    if ((var11.field4744 & var7) == var9) {
                        return false;
                    }
                    var11.field4744 &= ~var7;
                    var11.field4744 |= var9;
                    return true;
                }
                var10.method7651();
            }
        }
        this.field1720.method7946(new class448(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fj.ar(IJ)Z")
    public boolean method3092(int arg0, long arg1) {
        if (this.field1720 == null) {
            this.field1720 = new class464(4);
        } else {
            class449 var4 = this.field1720.method7945((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class447) {
                    class447 var5 = (class447) var4;
                    if (var5.field4743 == arg1) {
                        return false;
                    }
                    var5.field4743 = arg1;
                    return true;
                }
                var4.method7651();
            }
        }
        this.field1720.method7946(new class447(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fj.am(ILjava/lang/String;I)Z")
    public boolean method3098(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1720 == null) {
            this.field1720 = new class464(4);
        } else {
            class449 var3 = this.field1720.method7945((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class445) {
                    class445 var4 = (class445) var3;
                    if (var4.field4741 instanceof String) {
                        if (arg1.equals(var4.field4741)) {
                            return false;
                        }
                        var4.method7651();
                        this.field1720.method7946(new class445(arg1), var4.field4745);
                        return true;
                    }
                }
                var3.method7651();
            }
        }
        this.field1720.method7946(new class445(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fj.as(Lsg;B)V")
    public void method3099(class489 arg0) {
        int var2 = arg0.method8248();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8248();
        if ((var3 & 0x1) != 0) {
            this.field1722 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1711 = true;
        }
        if (!this.field1722) {
            this.field1717 = null;
            this.field1731 = null;
        }
        if (!this.field1711) {
            this.field1732 = null;
            this.field1733 = null;
        }
        this.field1713 = arg0.method8254();
        this.field1715 = arg0.method8254();
        if (var2 <= 3 && this.field1715 != 0) {
            this.field1715 += 16912800;
        }
        this.field1721 = arg0.method8250();
        this.field1712 = arg0.method8248();
        this.field1714 = arg0.method8259();
        if (var2 >= 4) {
            arg0.method8254();
        }
        this.field1716 = arg0.method8248() == 1;
        this.field1729 = arg0.method8249();
        this.field1718 = arg0.method8249();
        this.field1719 = arg0.method8249();
        this.field1710 = arg0.method8249();
        if (this.field1721 > 0) {
            if (this.field1722 && (this.field1717 == null || this.field1717.length < this.field1721)) {
                this.field1717 = new long[this.field1721];
            }
            if (this.field1711 && (this.field1732 == null || this.field1732.length < this.field1721)) {
                this.field1732 = new String[this.field1721];
            }
            if (this.field1723 == null || this.field1723.length < this.field1721) {
                this.field1723 = new byte[this.field1721];
            }
            if (this.field1727 == null || this.field1727.length < this.field1721) {
                this.field1727 = new int[this.field1721];
            }
            if (this.field1726 == null || this.field1726.length < this.field1721) {
                this.field1726 = new int[this.field1721];
            }
            if (this.field1735 == null || this.field1735.length < this.field1721) {
                this.field1735 = new boolean[this.field1721];
            }
            for (int var4 = 0; var4 < this.field1721; var4++) {
                if (this.field1722) {
                    this.field1717[var4] = arg0.method8271();
                }
                if (this.field1711) {
                    this.field1732[var4] = arg0.method8305();
                }
                this.field1723[var4] = arg0.method8249();
                if (var2 >= 2) {
                    this.field1727[var4] = arg0.method8254();
                }
                if (var2 >= 5) {
                    this.field1726[var4] = arg0.method8250();
                } else {
                    this.field1726[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1735[var4] = arg0.method8248() == 1;
                } else {
                    this.field1735[var4] = false;
                }
            }
            this.method3088();
        }
        if (this.field1712 > 0) {
            if (this.field1722 && (this.field1731 == null || this.field1731.length < this.field1712)) {
                this.field1731 = new long[this.field1712];
            }
            if (this.field1711 && (this.field1733 == null || this.field1733.length < this.field1712)) {
                this.field1733 = new String[this.field1712];
            }
            for (int var5 = 0; var5 < this.field1712; var5++) {
                if (this.field1722) {
                    this.field1731[var5] = arg0.method8271();
                }
                if (this.field1711) {
                    this.field1733[var5] = arg0.method8305();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8250();
        if (var6 <= 0) {
            return;
        }
        this.field1720 = new class464(var6 < 16 ? class296.method1948(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8254();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8254();
                this.field1720.method7946(new class448(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8271();
                this.field1720.method7946(new class447(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8259();
                this.field1720.method7946(new class445(var13), (long) var8);
            }
        }
    }
}
