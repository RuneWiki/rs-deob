package deob;

@ObfuscatedName("go")
public class class162 {

    @ObfuscatedName("go.ae")
    public boolean field1763;

    @ObfuscatedName("go.ag")
    public boolean field1764;

    @ObfuscatedName("go.am")
    public long field1778;

    @ObfuscatedName("go.ax")
    public int field1766 = 0;

    @ObfuscatedName("go.aq")
    public String field1767 = null;

    @ObfuscatedName("go.af")
    public int field1768 = 0;

    @ObfuscatedName("go.at")
    public boolean field1769;

    @ObfuscatedName("go.au")
    public byte field1770;

    @ObfuscatedName("go.ar")
    public byte field1771;

    @ObfuscatedName("go.al")
    public byte field1772;

    @ObfuscatedName("go.ad")
    public byte field1773;

    @ObfuscatedName("go.ah")
    public int field1774;

    @ObfuscatedName("go.ap")
    public long[] field1775;

    @ObfuscatedName("go.ab")
    public byte[] field1776;

    @ObfuscatedName("go.az")
    public int[] field1762;

    @ObfuscatedName("go.aa")
    public int[] field1785;

    @ObfuscatedName("go.ai")
    public int[] field1779;

    @ObfuscatedName("go.ao")
    public boolean[] field1780;

    @ObfuscatedName("go.as")
    public int field1781 = -1;

    @ObfuscatedName("go.ay")
    public int field1782 = -1;

    @ObfuscatedName("go.aj")
    public int field1783;

    @ObfuscatedName("go.av")
    public long[] field1765;

    @ObfuscatedName("go.aw")
    public String[] field1789;

    @ObfuscatedName("go.an")
    public String[] field1790;

    @ObfuscatedName("go.ak")
    public class523 field1787;

    public class162(class551 arg0) {
        this.method3319(arg0);
    }

    @ObfuscatedName("go.ac(IB)V")
    public void method3300(int arg0) {
        if (this.field1763) {
            if (this.field1775 == null) {
                this.field1775 = new long[arg0];
            } else {
                System.arraycopy(this.field1775, 0, this.field1775 = new long[arg0], 0, this.field1774);
            }
        }
        if (this.field1764) {
            if (this.field1789 == null) {
                this.field1789 = new String[arg0];
            } else {
                System.arraycopy(this.field1789, 0, this.field1789 = new String[arg0], 0, this.field1774);
            }
        }
        if (this.field1776 == null) {
            this.field1776 = new byte[arg0];
        } else {
            System.arraycopy(this.field1776, 0, this.field1776 = new byte[arg0], 0, this.field1774);
        }
        if (this.field1785 == null) {
            this.field1785 = new int[arg0];
        } else {
            System.arraycopy(this.field1785, 0, this.field1785 = new int[arg0], 0, this.field1774);
        }
        if (this.field1779 == null) {
            this.field1779 = new int[arg0];
        } else {
            System.arraycopy(this.field1779, 0, this.field1779 = new int[arg0], 0, this.field1774);
        }
        if (this.field1780 == null) {
            this.field1780 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1780, 0, this.field1780 = new boolean[arg0], 0, this.field1774);
        }
    }

    @ObfuscatedName("go.ae(II)V")
    public void method3337(int arg0) {
        if (this.field1763) {
            if (this.field1765 == null) {
                this.field1765 = new long[arg0];
            } else {
                System.arraycopy(this.field1765, 0, this.field1765 = new long[arg0], 0, this.field1783);
            }
        }
        if (!this.field1764) {
            return;
        }
        if (this.field1790 == null) {
            this.field1790 = new String[arg0];
        } else {
            System.arraycopy(this.field1790, 0, this.field1790 = new String[arg0], 0, this.field1783);
        }
    }

    @ObfuscatedName("go.ag(Ljava/lang/String;I)I")
    public int method3330(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1774; var2++) {
            if (this.field1789[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("go.am(IIII)I")
    public int method3303(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1785[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("go.ax(II)Ljava/lang/Integer;")
    public Integer method3321(int arg0) {
        if (this.field1787 == null) {
            return null;
        } else {
            class508 var2 = this.field1787.method8666((long) arg0);
            return var2 != null && var2 instanceof class507 ? Integer.valueOf(((class507) var2).field5120) : null;
        }
    }

    @ObfuscatedName("go.aq(B)[I")
    public int[] method3305() {
        if (this.field1762 == null) {
            String[] var1 = new String[this.field1774];
            this.field1762 = new int[this.field1774];
            int var2 = 0;
            while (var2 < this.field1774) {
                var1[var2] = this.field1789[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1762[var2] = var2++;
            }
            class545.method3207(var1, this.field1762);
        }
        return this.field1762;
    }

    @ObfuscatedName("go.af(JLjava/lang/String;II)V")
    public void method3328(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1763 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1764 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1775 == null || this.field1774 >= this.field1775.length) || arg1 != null && (this.field1789 == null || this.field1774 >= this.field1789.length)) {
                this.method3300(this.field1774 + 5);
            }
            if (this.field1775 != null) {
                this.field1775[this.field1774] = arg0;
            }
            if (this.field1789 != null) {
                this.field1789[this.field1774] = arg1;
            }
            if (this.field1781 == -1) {
                this.field1781 = this.field1774;
                this.field1776[this.field1774] = 126;
            } else {
                this.field1776[this.field1774] = 0;
            }
            this.field1785[this.field1774] = 0;
            this.field1779[this.field1774] = arg2;
            this.field1780[this.field1774] = false;
            this.field1774++;
            this.field1762 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("go.at(II)V")
    public void method3307(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1774) {
            throw new RuntimeException("");
        }
        this.field1774--;
        this.field1762 = null;
        if (this.field1774 == 0) {
            this.field1775 = null;
            this.field1789 = null;
            this.field1776 = null;
            this.field1785 = null;
            this.field1779 = null;
            this.field1780 = null;
            this.field1781 = -1;
            this.field1782 = -1;
            return;
        }
        System.arraycopy(this.field1776, arg0 + 1, this.field1776, arg0, this.field1774 - arg0);
        System.arraycopy(this.field1785, arg0 + 1, this.field1785, arg0, this.field1774 - arg0);
        System.arraycopy(this.field1779, arg0 + 1, this.field1779, arg0, this.field1774 - arg0);
        System.arraycopy(this.field1780, arg0 + 1, this.field1780, arg0, this.field1774 - arg0);
        if (this.field1775 != null) {
            System.arraycopy(this.field1775, arg0 + 1, this.field1775, arg0, this.field1774 - arg0);
        }
        if (this.field1789 != null) {
            System.arraycopy(this.field1789, arg0 + 1, this.field1789, arg0, this.field1774 - arg0);
        }
        this.method3359();
    }

    @ObfuscatedName("go.au(S)V")
    public void method3359() {
        if (this.field1774 == 0) {
            this.field1781 = -1;
            this.field1782 = -1;
            return;
        }
        this.field1781 = -1;
        this.field1782 = -1;
        int var1 = 0;
        byte var2 = this.field1776[0];
        for (int var3 = 1; var3 < this.field1774; var3++) {
            if (this.field1776[var3] > var2) {
                if (var2 == 125) {
                    this.field1782 = var1;
                }
                var1 = var3;
                var2 = this.field1776[var3];
            } else if (this.field1782 == -1 && this.field1776[var3] == 125) {
                this.field1782 = var3;
            }
        }
        this.field1781 = var1;
        if (this.field1781 != -1) {
            this.field1776[this.field1781] = 126;
        }
    }

    @ObfuscatedName("go.ar(JLjava/lang/String;I)V")
    public void method3309(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1763) {
            throw new RuntimeException("");
        } else if (this.field1764 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1765 == null || this.field1783 >= this.field1765.length) || arg1 != null && (this.field1790 == null || this.field1783 >= this.field1790.length)) {
                this.method3337(this.field1783 + 5);
            }
            if (this.field1765 != null) {
                this.field1765[this.field1783] = arg0;
            }
            if (this.field1790 != null) {
                this.field1790[this.field1783] = arg1;
            }
            this.field1783++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("go.al(II)V")
    public void method3354(int arg0) {
        this.field1783--;
        if (this.field1783 == 0) {
            this.field1765 = null;
            this.field1790 = null;
            return;
        }
        if (this.field1765 != null) {
            System.arraycopy(this.field1765, arg0 + 1, this.field1765, arg0, this.field1783 - arg0);
        }
        if (this.field1790 != null) {
            System.arraycopy(this.field1790, arg0 + 1, this.field1790, arg0, this.field1783 - arg0);
        }
    }

    @ObfuscatedName("go.ad(IBB)I")
    public int method3311(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1781 == arg0 && (this.field1782 == -1 || this.field1776[this.field1782] < 125)) {
            return -1;
        } else if (this.field1776[arg0] == arg1) {
            return -1;
        } else {
            this.field1776[arg0] = arg1;
            this.method3359();
            return arg0;
        }
    }

    @ObfuscatedName("go.ah(II)Z")
    public boolean method3312(int arg0) {
        if (this.field1781 == arg0 || this.field1776[arg0] == 126) {
            return false;
        }
        this.field1776[this.field1781] = 125;
        this.field1782 = this.field1781;
        this.field1776[arg0] = 126;
        this.field1781 = arg0;
        return true;
    }

    @ObfuscatedName("go.ap(IZI)I")
    public int method3313(int arg0, boolean arg1) {
        if (this.field1780[arg0] == arg1) {
            return -1;
        } else {
            this.field1780[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("go.ab(IIIIB)I")
    public int method3347(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1785[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1785[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("go.az(III)Z")
    public boolean method3306(int arg0, int arg1) {
        if (this.field1787 == null) {
            this.field1787 = new class523(4);
        } else {
            class508 var3 = this.field1787.method8666((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class507) {
                    class507 var4 = (class507) var3;
                    if (var4.field5120 == arg1) {
                        return false;
                    }
                    var4.field5120 = arg1;
                    return true;
                }
                var3.method8362();
            }
        }
        this.field1787.method8663(new class507(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("go.aa(IIIIB)Z")
    public boolean method3316(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1787 == null) {
            this.field1787 = new class523(4);
        } else {
            class508 var10 = this.field1787.method8666((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class507) {
                    class507 var11 = (class507) var10;
                    if ((var11.field5120 & var7) == var9) {
                        return false;
                    }
                    var11.field5120 &= ~var7;
                    var11.field5120 |= var9;
                    return true;
                }
                var10.method8362();
            }
        }
        this.field1787.method8663(new class507(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("go.ai(IJ)Z")
    public boolean method3317(int arg0, long arg1) {
        if (this.field1787 == null) {
            this.field1787 = new class523(4);
        } else {
            class508 var4 = this.field1787.method8666((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class506) {
                    class506 var5 = (class506) var4;
                    if (var5.field5119 == arg1) {
                        return false;
                    }
                    var5.field5119 = arg1;
                    return true;
                }
                var4.method8362();
            }
        }
        this.field1787.method8663(new class506(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("go.ao(ILjava/lang/String;I)Z")
    public boolean method3318(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1787 == null) {
            this.field1787 = new class523(4);
        } else {
            class508 var3 = this.field1787.method8666((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class505) {
                    class505 var4 = (class505) var3;
                    if (var4.field5118 instanceof String) {
                        if (arg1.equals(var4.field5118)) {
                            return false;
                        }
                        var4.method8362();
                        this.field1787.method8663(new class505(arg1), var4.field5122);
                        return true;
                    }
                }
                var3.method8362();
            }
        }
        this.field1787.method8663(new class505(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("go.as(Lvf;I)V")
    public void method3319(class551 arg0) {
        int var2 = arg0.method8955();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8955();
        if ((var3 & 0x1) != 0) {
            this.field1763 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1764 = true;
        }
        if (!this.field1763) {
            this.field1775 = null;
            this.field1765 = null;
        }
        if (!this.field1764) {
            this.field1789 = null;
            this.field1790 = null;
        }
        this.field1766 = arg0.method9110();
        this.field1768 = arg0.method9110();
        if (var2 <= 3 && this.field1768 != 0) {
            this.field1768 += 16912800;
        }
        this.field1774 = arg0.method9119();
        this.field1783 = arg0.method8955();
        this.field1767 = arg0.method9166();
        if (var2 >= 4) {
            arg0.method9110();
        }
        this.field1769 = arg0.method8955() == 1;
        this.field1770 = arg0.method8975();
        this.field1771 = arg0.method8975();
        this.field1772 = arg0.method8975();
        this.field1773 = arg0.method8975();
        if (this.field1774 > 0) {
            if (this.field1763 && (this.field1775 == null || this.field1775.length < this.field1774)) {
                this.field1775 = new long[this.field1774];
            }
            if (this.field1764 && (this.field1789 == null || this.field1789.length < this.field1774)) {
                this.field1789 = new String[this.field1774];
            }
            if (this.field1776 == null || this.field1776.length < this.field1774) {
                this.field1776 = new byte[this.field1774];
            }
            if (this.field1785 == null || this.field1785.length < this.field1774) {
                this.field1785 = new int[this.field1774];
            }
            if (this.field1779 == null || this.field1779.length < this.field1774) {
                this.field1779 = new int[this.field1774];
            }
            if (this.field1780 == null || this.field1780.length < this.field1774) {
                this.field1780 = new boolean[this.field1774];
            }
            for (int var4 = 0; var4 < this.field1774; var4++) {
                if (this.field1763) {
                    this.field1775[var4] = arg0.method8980();
                }
                if (this.field1764) {
                    this.field1789[var4] = arg0.method8987();
                }
                this.field1776[var4] = arg0.method8975();
                if (var2 >= 2) {
                    this.field1785[var4] = arg0.method9110();
                }
                if (var2 >= 5) {
                    this.field1779[var4] = arg0.method9119();
                } else {
                    this.field1779[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1780[var4] = arg0.method8955() == 1;
                } else {
                    this.field1780[var4] = false;
                }
            }
            this.method3359();
        }
        if (this.field1783 > 0) {
            if (this.field1763 && (this.field1765 == null || this.field1765.length < this.field1783)) {
                this.field1765 = new long[this.field1783];
            }
            if (this.field1764 && (this.field1790 == null || this.field1790.length < this.field1783)) {
                this.field1790 = new String[this.field1783];
            }
            for (int var5 = 0; var5 < this.field1783; var5++) {
                if (this.field1763) {
                    this.field1765[var5] = arg0.method8980();
                }
                if (this.field1764) {
                    this.field1790[var5] = arg0.method8987();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method9119();
        if (var6 <= 0) {
            return;
        }
        this.field1787 = new class523(var6 < 16 ? class333.method44(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method9110();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method9110();
                this.field1787.method8663(new class507(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8980();
                this.field1787.method8663(new class506(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method9166();
                this.field1787.method8663(new class505(var13), (long) var8);
            }
        }
    }
}
