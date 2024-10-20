package deob;

@ObfuscatedName("gy")
public class class162 {

    @ObfuscatedName("gy.aw")
    public boolean field1766;

    @ObfuscatedName("gy.ak")
    public boolean field1767;

    @ObfuscatedName("gy.aj")
    public long field1782;

    @ObfuscatedName("gy.ai")
    public int field1768 = 0;

    @ObfuscatedName("gy.ay")
    public String field1779 = null;

    @ObfuscatedName("gy.as")
    public int field1771 = 0;

    @ObfuscatedName("gy.ae")
    public boolean field1772;

    @ObfuscatedName("gy.am")
    public byte field1773;

    @ObfuscatedName("gy.at")
    public byte field1777;

    @ObfuscatedName("gy.au")
    public byte field1791;

    @ObfuscatedName("gy.an")
    public byte field1776;

    @ObfuscatedName("gy.ao")
    public int field1775;

    @ObfuscatedName("gy.af")
    public long[] field1778;

    @ObfuscatedName("gy.ar")
    public byte[] field1790;

    @ObfuscatedName("gy.ab")
    public int[] field1780;

    @ObfuscatedName("gy.az")
    public int[] field1781;

    @ObfuscatedName("gy.ag")
    public int[] field1769;

    @ObfuscatedName("gy.ad")
    public boolean[] field1774;

    @ObfuscatedName("gy.ac")
    public int field1784 = -1;

    @ObfuscatedName("gy.av")
    public int field1785 = -1;

    @ObfuscatedName("gy.ax")
    public int field1770;

    @ObfuscatedName("gy.aq")
    public long[] field1783;

    @ObfuscatedName("gy.al")
    public String[] field1788;

    @ObfuscatedName("gy.aa")
    public String[] field1789;

    @ObfuscatedName("gy.ah")
    public class530 field1787;

    public class162(class558 arg0) {
        this.method3465(arg0);
    }

    @ObfuscatedName("gy.ap(IS)V")
    public void method3447(int arg0) {
        if (this.field1766) {
            if (this.field1778 == null) {
                this.field1778 = new long[arg0];
            } else {
                System.arraycopy(this.field1778, 0, this.field1778 = new long[arg0], 0, this.field1775);
            }
        }
        if (this.field1767) {
            if (this.field1788 == null) {
                this.field1788 = new String[arg0];
            } else {
                System.arraycopy(this.field1788, 0, this.field1788 = new String[arg0], 0, this.field1775);
            }
        }
        if (this.field1790 == null) {
            this.field1790 = new byte[arg0];
        } else {
            System.arraycopy(this.field1790, 0, this.field1790 = new byte[arg0], 0, this.field1775);
        }
        if (this.field1781 == null) {
            this.field1781 = new int[arg0];
        } else {
            System.arraycopy(this.field1781, 0, this.field1781 = new int[arg0], 0, this.field1775);
        }
        if (this.field1769 == null) {
            this.field1769 = new int[arg0];
        } else {
            System.arraycopy(this.field1769, 0, this.field1769 = new int[arg0], 0, this.field1775);
        }
        if (this.field1774 == null) {
            this.field1774 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1774, 0, this.field1774 = new boolean[arg0], 0, this.field1775);
        }
    }

    @ObfuscatedName("gy.aw(II)V")
    public void method3506(int arg0) {
        if (this.field1766) {
            if (this.field1783 == null) {
                this.field1783 = new long[arg0];
            } else {
                System.arraycopy(this.field1783, 0, this.field1783 = new long[arg0], 0, this.field1770);
            }
        }
        if (!this.field1767) {
            return;
        }
        if (this.field1789 == null) {
            this.field1789 = new String[arg0];
        } else {
            System.arraycopy(this.field1789, 0, this.field1789 = new String[arg0], 0, this.field1770);
        }
    }

    @ObfuscatedName("gy.ak(Ljava/lang/String;B)I")
    public int method3489(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1775; var2++) {
            if (this.field1788[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gy.aj(IIII)I")
    public int method3495(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1781[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gy.ai(II)Ljava/lang/Integer;")
    public Integer method3451(int arg0) {
        if (this.field1787 == null) {
            return null;
        } else {
            class515 var2 = this.field1787.method8985((long) arg0);
            return var2 != null && var2 instanceof class514 ? Integer.valueOf(((class514) var2).field5168) : null;
        }
    }

    @ObfuscatedName("gy.ay(I)[I")
    public int[] method3508() {
        if (this.field1780 == null) {
            String[] var1 = new String[this.field1775];
            this.field1780 = new int[this.field1775];
            int var2 = 0;
            while (var2 < this.field1775) {
                var1[var2] = this.field1788[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1780[var2] = var2++;
            }
            int[] var3 = this.field1780;
            class552.method2340(var1, var3, 0, var1.length - 1);
        }
        return this.field1780;
    }

    @ObfuscatedName("gy.as(JLjava/lang/String;II)V")
    public void method3453(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1766) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1767) {
            if (arg0 > 0L && (this.field1778 == null || this.field1775 >= this.field1778.length) || arg1 != null && (this.field1788 == null || this.field1775 >= this.field1788.length)) {
                this.method3447(this.field1775 + 5);
            }
            if (this.field1778 != null) {
                this.field1778[this.field1775] = arg0;
            }
            if (this.field1788 != null) {
                this.field1788[this.field1775] = arg1;
            }
            if (this.field1784 == -1) {
                this.field1784 = this.field1775;
                this.field1790[this.field1775] = 126;
            } else {
                this.field1790[this.field1775] = 0;
            }
            this.field1781[this.field1775] = 0;
            this.field1769[this.field1775] = arg2;
            this.field1774[this.field1775] = false;
            this.field1775++;
            this.field1780 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gy.ae(II)V")
    public void method3454(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1775) {
            throw new RuntimeException("");
        }
        this.field1775--;
        this.field1780 = null;
        if (this.field1775 == 0) {
            this.field1778 = null;
            this.field1788 = null;
            this.field1790 = null;
            this.field1781 = null;
            this.field1769 = null;
            this.field1774 = null;
            this.field1784 = -1;
            this.field1785 = -1;
            return;
        }
        System.arraycopy(this.field1790, arg0 + 1, this.field1790, arg0, this.field1775 - arg0);
        System.arraycopy(this.field1781, arg0 + 1, this.field1781, arg0, this.field1775 - arg0);
        System.arraycopy(this.field1769, arg0 + 1, this.field1769, arg0, this.field1775 - arg0);
        System.arraycopy(this.field1774, arg0 + 1, this.field1774, arg0, this.field1775 - arg0);
        if (this.field1778 != null) {
            System.arraycopy(this.field1778, arg0 + 1, this.field1778, arg0, this.field1775 - arg0);
        }
        if (this.field1788 != null) {
            System.arraycopy(this.field1788, arg0 + 1, this.field1788, arg0, this.field1775 - arg0);
        }
        this.method3496();
    }

    @ObfuscatedName("gy.am(I)V")
    public void method3496() {
        if (this.field1775 == 0) {
            this.field1784 = -1;
            this.field1785 = -1;
            return;
        }
        this.field1784 = -1;
        this.field1785 = -1;
        int var1 = 0;
        byte var2 = this.field1790[0];
        for (int var3 = 1; var3 < this.field1775; var3++) {
            if (this.field1790[var3] > var2) {
                if (var2 == 125) {
                    this.field1785 = var1;
                }
                var1 = var3;
                var2 = this.field1790[var3];
            } else if (this.field1785 == -1 && this.field1790[var3] == 125) {
                this.field1785 = var3;
            }
        }
        this.field1784 = var1;
        if (this.field1784 != -1) {
            this.field1790[this.field1784] = 126;
        }
    }

    @ObfuscatedName("gy.at(JLjava/lang/String;I)V")
    public void method3520(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1766) {
            throw new RuntimeException("");
        } else if (this.field1767 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1783 == null || this.field1770 >= this.field1783.length) || arg1 != null && (this.field1789 == null || this.field1770 >= this.field1789.length)) {
                this.method3506(this.field1770 + 5);
            }
            if (this.field1783 != null) {
                this.field1783[this.field1770] = arg0;
            }
            if (this.field1789 != null) {
                this.field1789[this.field1770] = arg1;
            }
            this.field1770++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gy.au(II)V")
    public void method3457(int arg0) {
        this.field1770--;
        if (this.field1770 == 0) {
            this.field1783 = null;
            this.field1789 = null;
            return;
        }
        if (this.field1783 != null) {
            System.arraycopy(this.field1783, arg0 + 1, this.field1783, arg0, this.field1770 - arg0);
        }
        if (this.field1789 != null) {
            System.arraycopy(this.field1789, arg0 + 1, this.field1789, arg0, this.field1770 - arg0);
        }
    }

    @ObfuscatedName("gy.an(IBI)I")
    public int method3458(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1784 == arg0 && (this.field1785 == -1 || this.field1790[this.field1785] < 125)) {
            return -1;
        } else if (this.field1790[arg0] == arg1) {
            return -1;
        } else {
            this.field1790[arg0] = arg1;
            this.method3496();
            return arg0;
        }
    }

    @ObfuscatedName("gy.ao(IB)Z")
    public boolean method3490(int arg0) {
        if (this.field1784 == arg0 || this.field1790[arg0] == 126) {
            return false;
        }
        this.field1790[this.field1784] = 125;
        this.field1785 = this.field1784;
        this.field1790[arg0] = 126;
        this.field1784 = arg0;
        return true;
    }

    @ObfuscatedName("gy.af(IZI)I")
    public int method3460(int arg0, boolean arg1) {
        if (this.field1774[arg0] == arg1) {
            return -1;
        } else {
            this.field1774[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gy.ar(IIIII)I")
    public int method3461(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1781[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1781[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gy.ab(IIB)Z")
    public boolean method3462(int arg0, int arg1) {
        if (this.field1787 == null) {
            this.field1787 = new class530(4);
        } else {
            class515 var3 = this.field1787.method8985((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class514) {
                    class514 var4 = (class514) var3;
                    if (var4.field5168 == arg1) {
                        return false;
                    }
                    var4.field5168 = arg1;
                    return true;
                }
                var3.method8667();
            }
        }
        this.field1787.method8970(new class514(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gy.az(IIIIB)Z")
    public boolean method3463(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1787 == null) {
            this.field1787 = new class530(4);
        } else {
            class515 var10 = this.field1787.method8985((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class514) {
                    class514 var11 = (class514) var10;
                    if ((var11.field5168 & var7) == var9) {
                        return false;
                    }
                    var11.field5168 &= ~var7;
                    var11.field5168 |= var9;
                    return true;
                }
                var10.method8667();
            }
        }
        this.field1787.method8970(new class514(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gy.ag(IJ)Z")
    public boolean method3464(int arg0, long arg1) {
        if (this.field1787 == null) {
            this.field1787 = new class530(4);
        } else {
            class515 var4 = this.field1787.method8985((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class513) {
                    class513 var5 = (class513) var4;
                    if (var5.field5167 == arg1) {
                        return false;
                    }
                    var5.field5167 = arg1;
                    return true;
                }
                var4.method8667();
            }
        }
        this.field1787.method8970(new class513(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gy.ad(ILjava/lang/String;B)Z")
    public boolean method3452(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1787 == null) {
            this.field1787 = new class530(4);
        } else {
            class515 var3 = this.field1787.method8985((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class512) {
                    class512 var4 = (class512) var3;
                    if (var4.field5166 instanceof String) {
                        if (arg1.equals(var4.field5166)) {
                            return false;
                        }
                        var4.method8667();
                        this.field1787.method8970(new class512(arg1), var4.field5170);
                        return true;
                    }
                }
                var3.method8667();
            }
        }
        this.field1787.method8970(new class512(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gy.ac(Lvl;B)V")
    public void method3465(class558 arg0) {
        int var2 = arg0.method9258();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method9258();
        if ((var3 & 0x1) != 0) {
            this.field1766 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1767 = true;
        }
        if (!this.field1766) {
            this.field1778 = null;
            this.field1783 = null;
        }
        if (!this.field1767) {
            this.field1788 = null;
            this.field1789 = null;
        }
        this.field1768 = arg0.method9264();
        this.field1771 = arg0.method9264();
        if (var2 <= 3 && this.field1771 != 0) {
            this.field1771 += 16912800;
        }
        this.field1775 = arg0.method9260();
        this.field1770 = arg0.method9258();
        this.field1779 = arg0.method9269();
        if (var2 >= 4) {
            arg0.method9264();
        }
        this.field1772 = arg0.method9258() == 1;
        this.field1773 = arg0.method9259();
        this.field1777 = arg0.method9259();
        this.field1791 = arg0.method9259();
        this.field1776 = arg0.method9259();
        if (this.field1775 > 0) {
            if (this.field1766 && (this.field1778 == null || this.field1778.length < this.field1775)) {
                this.field1778 = new long[this.field1775];
            }
            if (this.field1767 && (this.field1788 == null || this.field1788.length < this.field1775)) {
                this.field1788 = new String[this.field1775];
            }
            if (this.field1790 == null || this.field1790.length < this.field1775) {
                this.field1790 = new byte[this.field1775];
            }
            if (this.field1781 == null || this.field1781.length < this.field1775) {
                this.field1781 = new int[this.field1775];
            }
            if (this.field1769 == null || this.field1769.length < this.field1775) {
                this.field1769 = new int[this.field1775];
            }
            if (this.field1774 == null || this.field1774.length < this.field1775) {
                this.field1774 = new boolean[this.field1775];
            }
            for (int var4 = 0; var4 < this.field1775; var4++) {
                if (this.field1766) {
                    this.field1778[var4] = arg0.method9265();
                }
                if (this.field1767) {
                    this.field1788[var4] = arg0.method9268();
                }
                this.field1790[var4] = arg0.method9259();
                if (var2 >= 2) {
                    this.field1781[var4] = arg0.method9264();
                }
                if (var2 >= 5) {
                    this.field1769[var4] = arg0.method9260();
                } else {
                    this.field1769[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1774[var4] = arg0.method9258() == 1;
                } else {
                    this.field1774[var4] = false;
                }
            }
            this.method3496();
        }
        if (this.field1770 > 0) {
            if (this.field1766 && (this.field1783 == null || this.field1783.length < this.field1770)) {
                this.field1783 = new long[this.field1770];
            }
            if (this.field1767 && (this.field1789 == null || this.field1789.length < this.field1770)) {
                this.field1789 = new String[this.field1770];
            }
            for (int var5 = 0; var5 < this.field1770; var5++) {
                if (this.field1766) {
                    this.field1783[var5] = arg0.method9265();
                }
                if (this.field1767) {
                    this.field1789[var5] = arg0.method9268();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method9260();
        if (var6 <= 0) {
            return;
        }
        this.field1787 = new class530(var6 < 16 ? class332.method2832(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method9264();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method9264();
                this.field1787.method8970(new class514(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method9265();
                this.field1787.method8970(new class513(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method9269();
                this.field1787.method8970(new class512(var13), (long) var8);
            }
        }
    }
}
