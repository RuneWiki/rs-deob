package deob;

@ObfuscatedName("fp")
public class class156 {

    @ObfuscatedName("fp.ah")
    public boolean field1733;

    @ObfuscatedName("fp.af")
    public boolean field1734;

    @ObfuscatedName("fp.at")
    public long field1735;

    @ObfuscatedName("fp.an")
    public int field1745 = 0;

    @ObfuscatedName("fp.ao")
    public String field1756 = null;

    @ObfuscatedName("fp.ab")
    public int field1738 = 0;

    @ObfuscatedName("fp.aw")
    public boolean field1739;

    @ObfuscatedName("fp.ad")
    public byte field1753;

    @ObfuscatedName("fp.al")
    public byte field1741;

    @ObfuscatedName("fp.as")
    public byte field1750;

    @ObfuscatedName("fp.ag")
    public byte field1742;

    @ObfuscatedName("fp.ai")
    public int field1744;

    @ObfuscatedName("fp.ax")
    public long[] field1736;

    @ObfuscatedName("fp.ar")
    public byte[] field1748;

    @ObfuscatedName("fp.aj")
    public int[] field1747;

    @ObfuscatedName("fp.au")
    public int[] field1740;

    @ObfuscatedName("fp.ay")
    public int[] field1749;

    @ObfuscatedName("fp.ap")
    public boolean[] field1737;

    @ObfuscatedName("fp.av")
    public int field1751 = -1;

    @ObfuscatedName("fp.aa")
    public int field1752 = -1;

    @ObfuscatedName("fp.aq")
    public int field1732;

    @ObfuscatedName("fp.am")
    public long[] field1754;

    @ObfuscatedName("fp.ac")
    public String[] field1755;

    @ObfuscatedName("fp.ae")
    public String[] field1746;

    @ObfuscatedName("fp.ak")
    public class508 field1757;

    public class156(class535 arg0) {
        this.method3039(arg0);
    }

    @ObfuscatedName("fp.az(IB)V")
    public void method3020(int arg0) {
        if (this.field1733) {
            if (this.field1736 == null) {
                this.field1736 = new long[arg0];
            } else {
                System.arraycopy(this.field1736, 0, this.field1736 = new long[arg0], 0, this.field1744);
            }
        }
        if (this.field1734) {
            if (this.field1755 == null) {
                this.field1755 = new String[arg0];
            } else {
                System.arraycopy(this.field1755, 0, this.field1755 = new String[arg0], 0, this.field1744);
            }
        }
        if (this.field1748 == null) {
            this.field1748 = new byte[arg0];
        } else {
            System.arraycopy(this.field1748, 0, this.field1748 = new byte[arg0], 0, this.field1744);
        }
        if (this.field1740 == null) {
            this.field1740 = new int[arg0];
        } else {
            System.arraycopy(this.field1740, 0, this.field1740 = new int[arg0], 0, this.field1744);
        }
        if (this.field1749 == null) {
            this.field1749 = new int[arg0];
        } else {
            System.arraycopy(this.field1749, 0, this.field1749 = new int[arg0], 0, this.field1744);
        }
        if (this.field1737 == null) {
            this.field1737 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1737, 0, this.field1737 = new boolean[arg0], 0, this.field1744);
        }
    }

    @ObfuscatedName("fp.ah(II)V")
    public void method3021(int arg0) {
        if (this.field1733) {
            if (this.field1754 == null) {
                this.field1754 = new long[arg0];
            } else {
                System.arraycopy(this.field1754, 0, this.field1754 = new long[arg0], 0, this.field1732);
            }
        }
        if (!this.field1734) {
            return;
        }
        if (this.field1746 == null) {
            this.field1746 = new String[arg0];
        } else {
            System.arraycopy(this.field1746, 0, this.field1746 = new String[arg0], 0, this.field1732);
        }
    }

    @ObfuscatedName("fp.af(Ljava/lang/String;I)I")
    public int method3022(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1744; var2++) {
            if (this.field1755[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fp.at(IIII)I")
    public int method3023(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1740[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fp.an(IB)Ljava/lang/Integer;")
    public Integer method3024(int arg0) {
        if (this.field1757 == null) {
            return null;
        } else {
            class493 var2 = this.field1757.method8177((long) arg0);
            return var2 != null && var2 instanceof class492 ? Integer.valueOf(((class492) var2).field4949) : null;
        }
    }

    @ObfuscatedName("fp.ao(I)[I")
    public int[] method3025() {
        if (this.field1747 == null) {
            String[] var1 = new String[this.field1744];
            this.field1747 = new int[this.field1744];
            int var2 = 0;
            while (var2 < this.field1744) {
                var1[var2] = this.field1755[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1747[var2] = var2++;
            }
            class530.method8339(var1, this.field1747);
        }
        return this.field1747;
    }

    @ObfuscatedName("fp.ab(JLjava/lang/String;II)V")
    public void method3026(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1733) {
            throw new RuntimeException("");
        } else if (this.field1734 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1736 == null || this.field1744 >= this.field1736.length) || arg1 != null && (this.field1755 == null || this.field1744 >= this.field1755.length)) {
                this.method3020(this.field1744 + 5);
            }
            if (this.field1736 != null) {
                this.field1736[this.field1744] = arg0;
            }
            if (this.field1755 != null) {
                this.field1755[this.field1744] = arg1;
            }
            if (this.field1751 == -1) {
                this.field1751 = this.field1744;
                this.field1748[this.field1744] = 126;
            } else {
                this.field1748[this.field1744] = 0;
            }
            this.field1740[this.field1744] = 0;
            this.field1749[this.field1744] = arg2;
            this.field1737[this.field1744] = false;
            this.field1744++;
            this.field1747 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fp.aw(IB)V")
    public void method3070(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1744) {
            throw new RuntimeException("");
        }
        this.field1744--;
        this.field1747 = null;
        if (this.field1744 == 0) {
            this.field1736 = null;
            this.field1755 = null;
            this.field1748 = null;
            this.field1740 = null;
            this.field1749 = null;
            this.field1737 = null;
            this.field1751 = -1;
            this.field1752 = -1;
            return;
        }
        System.arraycopy(this.field1748, arg0 + 1, this.field1748, arg0, this.field1744 - arg0);
        System.arraycopy(this.field1740, arg0 + 1, this.field1740, arg0, this.field1744 - arg0);
        System.arraycopy(this.field1749, arg0 + 1, this.field1749, arg0, this.field1744 - arg0);
        System.arraycopy(this.field1737, arg0 + 1, this.field1737, arg0, this.field1744 - arg0);
        if (this.field1736 != null) {
            System.arraycopy(this.field1736, arg0 + 1, this.field1736, arg0, this.field1744 - arg0);
        }
        if (this.field1755 != null) {
            System.arraycopy(this.field1755, arg0 + 1, this.field1755, arg0, this.field1744 - arg0);
        }
        this.method3047();
    }

    @ObfuscatedName("fp.ad(I)V")
    public void method3047() {
        if (this.field1744 == 0) {
            this.field1751 = -1;
            this.field1752 = -1;
            return;
        }
        this.field1751 = -1;
        this.field1752 = -1;
        int var1 = 0;
        byte var2 = this.field1748[0];
        for (int var3 = 1; var3 < this.field1744; var3++) {
            if (this.field1748[var3] > var2) {
                if (var2 == 125) {
                    this.field1752 = var1;
                }
                var1 = var3;
                var2 = this.field1748[var3];
            } else if (this.field1752 == -1 && this.field1748[var3] == 125) {
                this.field1752 = var3;
            }
        }
        this.field1751 = var1;
        if (this.field1751 != -1) {
            this.field1748[this.field1751] = 126;
        }
    }

    @ObfuscatedName("fp.al(JLjava/lang/String;I)V")
    public void method3077(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1733 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1734) {
            if (arg0 > 0L && (this.field1754 == null || this.field1732 >= this.field1754.length) || arg1 != null && (this.field1746 == null || this.field1732 >= this.field1746.length)) {
                this.method3021(this.field1732 + 5);
            }
            if (this.field1754 != null) {
                this.field1754[this.field1732] = arg0;
            }
            if (this.field1746 != null) {
                this.field1746[this.field1732] = arg1;
            }
            this.field1732++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fp.as(II)V")
    public void method3030(int arg0) {
        this.field1732--;
        if (this.field1732 == 0) {
            this.field1754 = null;
            this.field1746 = null;
            return;
        }
        if (this.field1754 != null) {
            System.arraycopy(this.field1754, arg0 + 1, this.field1754, arg0, this.field1732 - arg0);
        }
        if (this.field1746 != null) {
            System.arraycopy(this.field1746, arg0 + 1, this.field1746, arg0, this.field1732 - arg0);
        }
    }

    @ObfuscatedName("fp.ag(IBB)I")
    public int method3087(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1751 == arg0 && (this.field1752 == -1 || this.field1748[this.field1752] < 125)) {
            return -1;
        } else if (this.field1748[arg0] == arg1) {
            return -1;
        } else {
            this.field1748[arg0] = arg1;
            this.method3047();
            return arg0;
        }
    }

    @ObfuscatedName("fp.ai(IB)Z")
    public boolean method3061(int arg0) {
        if (this.field1751 == arg0 || this.field1748[arg0] == 126) {
            return false;
        }
        this.field1748[this.field1751] = 125;
        this.field1752 = this.field1751;
        this.field1748[arg0] = 126;
        this.field1751 = arg0;
        return true;
    }

    @ObfuscatedName("fp.ax(IZI)I")
    public int method3033(int arg0, boolean arg1) {
        if (this.field1737[arg0] == arg1) {
            return -1;
        } else {
            this.field1737[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fp.ar(IIIII)I")
    public int method3034(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1740[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1740[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fp.aj(III)Z")
    public boolean method3048(int arg0, int arg1) {
        if (this.field1757 == null) {
            this.field1757 = new class508(4);
        } else {
            class493 var3 = this.field1757.method8177((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class492) {
                    class492 var4 = (class492) var3;
                    if (var4.field4949 == arg1) {
                        return false;
                    }
                    var4.field4949 = arg1;
                    return true;
                }
                var3.method7855();
            }
        }
        this.field1757.method8200(new class492(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fp.au(IIIII)Z")
    public boolean method3032(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1757 == null) {
            this.field1757 = new class508(4);
        } else {
            class493 var10 = this.field1757.method8177((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class492) {
                    class492 var11 = (class492) var10;
                    if ((var11.field4949 & var7) == var9) {
                        return false;
                    }
                    var11.field4949 &= ~var7;
                    var11.field4949 |= var9;
                    return true;
                }
                var10.method7855();
            }
        }
        this.field1757.method8200(new class492(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fp.ay(IJ)Z")
    public boolean method3037(int arg0, long arg1) {
        if (this.field1757 == null) {
            this.field1757 = new class508(4);
        } else {
            class493 var4 = this.field1757.method8177((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class491) {
                    class491 var5 = (class491) var4;
                    if (var5.field4948 == arg1) {
                        return false;
                    }
                    var5.field4948 = arg1;
                    return true;
                }
                var4.method7855();
            }
        }
        this.field1757.method8200(new class491(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fp.ap(ILjava/lang/String;B)Z")
    public boolean method3038(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1757 == null) {
            this.field1757 = new class508(4);
        } else {
            class493 var3 = this.field1757.method8177((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class490) {
                    class490 var4 = (class490) var3;
                    if (var4.field4947 instanceof String) {
                        if (arg1.equals(var4.field4947)) {
                            return false;
                        }
                        var4.method7855();
                        this.field1757.method8200(new class490(arg1), var4.field4951);
                        return true;
                    }
                }
                var3.method7855();
            }
        }
        this.field1757.method8200(new class490(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fp.av(Lur;I)V")
    public void method3039(class535 arg0) {
        int var2 = arg0.method8462();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8462();
        if ((var3 & 0x1) != 0) {
            this.field1733 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1734 = true;
        }
        if (!this.field1733) {
            this.field1736 = null;
            this.field1754 = null;
        }
        if (!this.field1734) {
            this.field1755 = null;
            this.field1746 = null;
        }
        this.field1745 = arg0.method8682();
        this.field1738 = arg0.method8682();
        if (var2 <= 3 && this.field1738 != 0) {
            this.field1738 += 16912800;
        }
        this.field1744 = arg0.method8670();
        this.field1732 = arg0.method8462();
        this.field1756 = arg0.method8473();
        if (var2 >= 4) {
            arg0.method8682();
        }
        this.field1739 = arg0.method8462() == 1;
        this.field1753 = arg0.method8463();
        this.field1741 = arg0.method8463();
        this.field1750 = arg0.method8463();
        this.field1742 = arg0.method8463();
        if (this.field1744 > 0) {
            if (this.field1733 && (this.field1736 == null || this.field1736.length < this.field1744)) {
                this.field1736 = new long[this.field1744];
            }
            if (this.field1734 && (this.field1755 == null || this.field1755.length < this.field1744)) {
                this.field1755 = new String[this.field1744];
            }
            if (this.field1748 == null || this.field1748.length < this.field1744) {
                this.field1748 = new byte[this.field1744];
            }
            if (this.field1740 == null || this.field1740.length < this.field1744) {
                this.field1740 = new int[this.field1744];
            }
            if (this.field1749 == null || this.field1749.length < this.field1744) {
                this.field1749 = new int[this.field1744];
            }
            if (this.field1737 == null || this.field1737.length < this.field1744) {
                this.field1737 = new boolean[this.field1744];
            }
            for (int var4 = 0; var4 < this.field1744; var4++) {
                if (this.field1733) {
                    this.field1736[var4] = arg0.method8469();
                }
                if (this.field1734) {
                    this.field1755[var4] = arg0.method8622();
                }
                this.field1748[var4] = arg0.method8463();
                if (var2 >= 2) {
                    this.field1740[var4] = arg0.method8682();
                }
                if (var2 >= 5) {
                    this.field1749[var4] = arg0.method8670();
                } else {
                    this.field1749[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1737[var4] = arg0.method8462() == 1;
                } else {
                    this.field1737[var4] = false;
                }
            }
            this.method3047();
        }
        if (this.field1732 > 0) {
            if (this.field1733 && (this.field1754 == null || this.field1754.length < this.field1732)) {
                this.field1754 = new long[this.field1732];
            }
            if (this.field1734 && (this.field1746 == null || this.field1746.length < this.field1732)) {
                this.field1746 = new String[this.field1732];
            }
            for (int var5 = 0; var5 < this.field1732; var5++) {
                if (this.field1733) {
                    this.field1754[var5] = arg0.method8469();
                }
                if (this.field1734) {
                    this.field1746[var5] = arg0.method8622();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8670();
        if (var6 <= 0) {
            return;
        }
        this.field1757 = new class508(var6 < 16 ? class320.method3400(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8682();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8682();
                this.field1757.method8200(new class492(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8469();
                this.field1757.method8200(new class491(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8473();
                this.field1757.method8200(new class490(var13), (long) var8);
            }
        }
    }
}
