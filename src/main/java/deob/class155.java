package deob;

@ObfuscatedName("fx")
public class class155 {

    @ObfuscatedName("fx.ay")
    public boolean field1712;

    @ObfuscatedName("fx.ar")
    public boolean field1724;

    @ObfuscatedName("fx.am")
    public long field1705;

    @ObfuscatedName("fx.as")
    public int field1708 = 0;

    @ObfuscatedName("fx.aj")
    public String field1709 = null;

    @ObfuscatedName("fx.ag")
    public int field1710 = 0;

    @ObfuscatedName("fx.az")
    public boolean field1711;

    @ObfuscatedName("fx.av")
    public byte field1713;

    @ObfuscatedName("fx.ap")
    public byte field1707;

    @ObfuscatedName("fx.aq")
    public byte field1714;

    @ObfuscatedName("fx.at")
    public byte field1715;

    @ObfuscatedName("fx.ah")
    public int field1716;

    @ObfuscatedName("fx.ax")
    public long[] field1717;

    @ObfuscatedName("fx.aa")
    public byte[] field1718;

    @ObfuscatedName("fx.au")
    public int[] field1719;

    @ObfuscatedName("fx.ae")
    public int[] field1720;

    @ObfuscatedName("fx.ab")
    public int[] field1721;

    @ObfuscatedName("fx.ad")
    public boolean[] field1722;

    @ObfuscatedName("fx.ao")
    public int field1723 = -1;

    @ObfuscatedName("fx.ac")
    public int field1726 = -1;

    @ObfuscatedName("fx.ak")
    public int field1725;

    @ObfuscatedName("fx.an")
    public long[] field1730;

    @ObfuscatedName("fx.af")
    public String[] field1727;

    @ObfuscatedName("fx.ai")
    public String[] field1728;

    @ObfuscatedName("fx.al")
    public class489 field1706;

    public class155(class514 arg0) {
        this.method3017(arg0);
    }

    @ObfuscatedName("fx.aw(IB)V")
    public void method2999(int arg0) {
        if (this.field1712) {
            if (this.field1717 == null) {
                this.field1717 = new long[arg0];
            } else {
                System.arraycopy(this.field1717, 0, this.field1717 = new long[arg0], 0, this.field1716);
            }
        }
        if (this.field1724) {
            if (this.field1727 == null) {
                this.field1727 = new String[arg0];
            } else {
                System.arraycopy(this.field1727, 0, this.field1727 = new String[arg0], 0, this.field1716);
            }
        }
        if (this.field1718 == null) {
            this.field1718 = new byte[arg0];
        } else {
            System.arraycopy(this.field1718, 0, this.field1718 = new byte[arg0], 0, this.field1716);
        }
        if (this.field1720 == null) {
            this.field1720 = new int[arg0];
        } else {
            System.arraycopy(this.field1720, 0, this.field1720 = new int[arg0], 0, this.field1716);
        }
        if (this.field1721 == null) {
            this.field1721 = new int[arg0];
        } else {
            System.arraycopy(this.field1721, 0, this.field1721 = new int[arg0], 0, this.field1716);
        }
        if (this.field1722 == null) {
            this.field1722 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1722, 0, this.field1722 = new boolean[arg0], 0, this.field1716);
        }
    }

    @ObfuscatedName("fx.ay(IB)V")
    public void method3000(int arg0) {
        if (this.field1712) {
            if (this.field1730 == null) {
                this.field1730 = new long[arg0];
            } else {
                System.arraycopy(this.field1730, 0, this.field1730 = new long[arg0], 0, this.field1725);
            }
        }
        if (!this.field1724) {
            return;
        }
        if (this.field1728 == null) {
            this.field1728 = new String[arg0];
        } else {
            System.arraycopy(this.field1728, 0, this.field1728 = new String[arg0], 0, this.field1725);
        }
    }

    @ObfuscatedName("fx.ar(Ljava/lang/String;B)I")
    public int method3015(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1716; var2++) {
            if (this.field1727[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fx.am(IIII)I")
    public int method3044(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1720[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fx.as(II)Ljava/lang/Integer;")
    public Integer method3003(int arg0) {
        if (this.field1706 == null) {
            return null;
        } else {
            class474 var2 = this.field1706.method7961((long) arg0);
            return var2 != null && var2 instanceof class473 ? Integer.valueOf(((class473) var2).field4817) : null;
        }
    }

    @ObfuscatedName("fx.aj(B)[I")
    public int[] method3004() {
        if (this.field1719 == null) {
            String[] var1 = new String[this.field1716];
            this.field1719 = new int[this.field1716];
            int var2 = 0;
            while (var2 < this.field1716) {
                var1[var2] = this.field1727[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1719[var2] = var2++;
            }
            int[] var3 = this.field1719;
            class511.method2302(var1, var3, 0, var1.length - 1);
        }
        return this.field1719;
    }

    @ObfuscatedName("fx.ag(JLjava/lang/String;II)V")
    public void method3007(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1712 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1724) {
            if (arg0 > 0L && (this.field1717 == null || this.field1716 >= this.field1717.length) || arg1 != null && (this.field1727 == null || this.field1716 >= this.field1727.length)) {
                this.method2999(this.field1716 + 5);
            }
            if (this.field1717 != null) {
                this.field1717[this.field1716] = arg0;
            }
            if (this.field1727 != null) {
                this.field1727[this.field1716] = arg1;
            }
            if (this.field1723 == -1) {
                this.field1723 = this.field1716;
                this.field1718[this.field1716] = 126;
            } else {
                this.field1718[this.field1716] = 0;
            }
            this.field1720[this.field1716] = 0;
            this.field1721[this.field1716] = arg2;
            this.field1722[this.field1716] = false;
            this.field1716++;
            this.field1719 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fx.az(II)V")
    public void method3051(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1716) {
            throw new RuntimeException("");
        }
        this.field1716--;
        this.field1719 = null;
        if (this.field1716 == 0) {
            this.field1717 = null;
            this.field1727 = null;
            this.field1718 = null;
            this.field1720 = null;
            this.field1721 = null;
            this.field1722 = null;
            this.field1723 = -1;
            this.field1726 = -1;
            return;
        }
        System.arraycopy(this.field1718, arg0 + 1, this.field1718, arg0, this.field1716 - arg0);
        System.arraycopy(this.field1720, arg0 + 1, this.field1720, arg0, this.field1716 - arg0);
        System.arraycopy(this.field1721, arg0 + 1, this.field1721, arg0, this.field1716 - arg0);
        System.arraycopy(this.field1722, arg0 + 1, this.field1722, arg0, this.field1716 - arg0);
        if (this.field1717 != null) {
            System.arraycopy(this.field1717, arg0 + 1, this.field1717, arg0, this.field1716 - arg0);
        }
        if (this.field1727 != null) {
            System.arraycopy(this.field1727, arg0 + 1, this.field1727, arg0, this.field1716 - arg0);
        }
        this.method3043();
    }

    @ObfuscatedName("fx.av(S)V")
    public void method3043() {
        if (this.field1716 == 0) {
            this.field1723 = -1;
            this.field1726 = -1;
            return;
        }
        this.field1723 = -1;
        this.field1726 = -1;
        int var1 = 0;
        byte var2 = this.field1718[0];
        for (int var3 = 1; var3 < this.field1716; var3++) {
            if (this.field1718[var3] > var2) {
                if (var2 == 125) {
                    this.field1726 = var1;
                }
                var1 = var3;
                var2 = this.field1718[var3];
            } else if (this.field1726 == -1 && this.field1718[var3] == 125) {
                this.field1726 = var3;
            }
        }
        this.field1723 = var1;
        if (this.field1723 != -1) {
            this.field1718[this.field1723] = 126;
        }
    }

    @ObfuscatedName("fx.ap(JLjava/lang/String;B)V")
    public void method3008(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1712 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1724 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1730 == null || this.field1725 >= this.field1730.length) || arg1 != null && (this.field1728 == null || this.field1725 >= this.field1728.length)) {
                this.method3000(this.field1725 + 5);
            }
            if (this.field1730 != null) {
                this.field1730[this.field1725] = arg0;
            }
            if (this.field1728 != null) {
                this.field1728[this.field1725] = arg1;
            }
            this.field1725++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fx.aq(II)V")
    public void method3009(int arg0) {
        this.field1725--;
        if (this.field1725 == 0) {
            this.field1730 = null;
            this.field1728 = null;
            return;
        }
        if (this.field1730 != null) {
            System.arraycopy(this.field1730, arg0 + 1, this.field1730, arg0, this.field1725 - arg0);
        }
        if (this.field1728 != null) {
            System.arraycopy(this.field1728, arg0 + 1, this.field1728, arg0, this.field1725 - arg0);
        }
    }

    @ObfuscatedName("fx.at(IBB)I")
    public int method3010(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1723 == arg0 && (this.field1726 == -1 || this.field1718[this.field1726] < 125)) {
            return -1;
        } else if (this.field1718[arg0] == arg1) {
            return -1;
        } else {
            this.field1718[arg0] = arg1;
            this.method3043();
            return arg0;
        }
    }

    @ObfuscatedName("fx.ah(II)Z")
    public boolean method3006(int arg0) {
        if (this.field1723 == arg0 || this.field1718[arg0] == 126) {
            return false;
        }
        this.field1718[this.field1723] = 125;
        this.field1726 = this.field1723;
        this.field1718[arg0] = 126;
        this.field1723 = arg0;
        return true;
    }

    @ObfuscatedName("fx.ax(IZI)I")
    public int method3033(int arg0, boolean arg1) {
        if (this.field1722[arg0] == arg1) {
            return -1;
        } else {
            this.field1722[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fx.aa(IIIII)I")
    public int method3013(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1720[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1720[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fx.au(III)Z")
    public boolean method3014(int arg0, int arg1) {
        if (this.field1706 == null) {
            this.field1706 = new class489(4);
        } else {
            class474 var3 = this.field1706.method7961((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class473) {
                    class473 var4 = (class473) var3;
                    if (var4.field4817 == arg1) {
                        return false;
                    }
                    var4.field4817 = arg1;
                    return true;
                }
                var3.method7662();
            }
        }
        this.field1706.method7962(new class473(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fx.ae(IIIII)Z")
    public boolean method3011(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1706 == null) {
            this.field1706 = new class489(4);
        } else {
            class474 var10 = this.field1706.method7961((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class473) {
                    class473 var11 = (class473) var10;
                    if ((var11.field4817 & var7) == var9) {
                        return false;
                    }
                    var11.field4817 &= ~var7;
                    var11.field4817 |= var9;
                    return true;
                }
                var10.method7662();
            }
        }
        this.field1706.method7962(new class473(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fx.ab(IJ)Z")
    public boolean method3016(int arg0, long arg1) {
        if (this.field1706 == null) {
            this.field1706 = new class489(4);
        } else {
            class474 var4 = this.field1706.method7961((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class472) {
                    class472 var5 = (class472) var4;
                    if (var5.field4816 == arg1) {
                        return false;
                    }
                    var5.field4816 = arg1;
                    return true;
                }
                var4.method7662();
            }
        }
        this.field1706.method7962(new class472(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fx.ad(ILjava/lang/String;S)Z")
    public boolean method3062(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1706 == null) {
            this.field1706 = new class489(4);
        } else {
            class474 var3 = this.field1706.method7961((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class471) {
                    class471 var4 = (class471) var3;
                    if (var4.field4815 instanceof String) {
                        if (arg1.equals(var4.field4815)) {
                            return false;
                        }
                        var4.method7662();
                        this.field1706.method7962(new class471(arg1), var4.field4819);
                        return true;
                    }
                }
                var3.method7662();
            }
        }
        this.field1706.method7962(new class471(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fx.ao(Lty;I)V")
    public void method3017(class514 arg0) {
        int var2 = arg0.method8244();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8244();
        if ((var3 & 0x1) != 0) {
            this.field1712 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1724 = true;
        }
        if (!this.field1712) {
            this.field1717 = null;
            this.field1730 = null;
        }
        if (!this.field1724) {
            this.field1727 = null;
            this.field1728 = null;
        }
        this.field1708 = arg0.method8496();
        this.field1710 = arg0.method8496();
        if (var2 <= 3 && this.field1710 != 0) {
            this.field1710 += 16912800;
        }
        this.field1716 = arg0.method8246();
        this.field1725 = arg0.method8244();
        this.field1709 = arg0.method8369();
        if (var2 >= 4) {
            arg0.method8496();
        }
        this.field1711 = arg0.method8244() == 1;
        this.field1713 = arg0.method8264();
        this.field1707 = arg0.method8264();
        this.field1714 = arg0.method8264();
        this.field1715 = arg0.method8264();
        if (this.field1716 > 0) {
            if (this.field1712 && (this.field1717 == null || this.field1717.length < this.field1716)) {
                this.field1717 = new long[this.field1716];
            }
            if (this.field1724 && (this.field1727 == null || this.field1727.length < this.field1716)) {
                this.field1727 = new String[this.field1716];
            }
            if (this.field1718 == null || this.field1718.length < this.field1716) {
                this.field1718 = new byte[this.field1716];
            }
            if (this.field1720 == null || this.field1720.length < this.field1716) {
                this.field1720 = new int[this.field1716];
            }
            if (this.field1721 == null || this.field1721.length < this.field1716) {
                this.field1721 = new int[this.field1716];
            }
            if (this.field1722 == null || this.field1722.length < this.field1716) {
                this.field1722 = new boolean[this.field1716];
            }
            for (int var4 = 0; var4 < this.field1716; var4++) {
                if (this.field1712) {
                    this.field1717[var4] = arg0.method8251();
                }
                if (this.field1724) {
                    this.field1727[var4] = arg0.method8254();
                }
                this.field1718[var4] = arg0.method8264();
                if (var2 >= 2) {
                    this.field1720[var4] = arg0.method8496();
                }
                if (var2 >= 5) {
                    this.field1721[var4] = arg0.method8246();
                } else {
                    this.field1721[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1722[var4] = arg0.method8244() == 1;
                } else {
                    this.field1722[var4] = false;
                }
            }
            this.method3043();
        }
        if (this.field1725 > 0) {
            if (this.field1712 && (this.field1730 == null || this.field1730.length < this.field1725)) {
                this.field1730 = new long[this.field1725];
            }
            if (this.field1724 && (this.field1728 == null || this.field1728.length < this.field1725)) {
                this.field1728 = new String[this.field1725];
            }
            for (int var5 = 0; var5 < this.field1725; var5++) {
                if (this.field1712) {
                    this.field1730[var5] = arg0.method8251();
                }
                if (this.field1724) {
                    this.field1728[var5] = arg0.method8254();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8246();
        if (var6 <= 0) {
            return;
        }
        this.field1706 = new class489(var6 < 16 ? class305.method2707(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8496();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8496();
                this.field1706.method7962(new class473(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8251();
                this.field1706.method7962(new class472(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8369();
                this.field1706.method7962(new class471(var13), (long) var8);
            }
        }
    }
}
