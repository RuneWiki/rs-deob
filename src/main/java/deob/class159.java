package deob;

@ObfuscatedName("gc")
public class class159 {

    @ObfuscatedName("gc.al")
    public boolean field1761;

    @ObfuscatedName("gc.aj")
    public boolean field1762;

    @ObfuscatedName("gc.az")
    public long field1785;

    @ObfuscatedName("gc.af")
    public int field1764 = 0;

    @ObfuscatedName("gc.aa")
    public String field1770 = null;

    @ObfuscatedName("gc.at")
    public int field1765 = 0;

    @ObfuscatedName("gc.ab")
    public boolean field1763;

    @ObfuscatedName("gc.ac")
    public byte field1768;

    @ObfuscatedName("gc.ao")
    public byte field1769;

    @ObfuscatedName("gc.ah")
    public byte field1774;

    @ObfuscatedName("gc.av")
    public byte field1771;

    @ObfuscatedName("gc.aq")
    public int field1772;

    @ObfuscatedName("gc.ap")
    public long[] field1773;

    @ObfuscatedName("gc.ae")
    public byte[] field1766;

    @ObfuscatedName("gc.ax")
    public int[] field1775;

    @ObfuscatedName("gc.ay")
    public int[] field1776;

    @ObfuscatedName("gc.au")
    public int[] field1777;

    @ObfuscatedName("gc.as")
    public boolean[] field1778;

    @ObfuscatedName("gc.aw")
    public int field1779 = -1;

    @ObfuscatedName("gc.ad")
    public int field1780 = -1;

    @ObfuscatedName("gc.ai")
    public int field1767;

    @ObfuscatedName("gc.an")
    public long[] field1782;

    @ObfuscatedName("gc.am")
    public String[] field1783;

    @ObfuscatedName("gc.ar")
    public String[] field1784;

    @ObfuscatedName("gc.ag")
    public class519 field1760;

    public class159(class546 arg0) {
        this.method3125(arg0);
    }

    @ObfuscatedName("gc.ak(IB)V")
    public void method3106(int arg0) {
        if (this.field1761) {
            if (this.field1773 == null) {
                this.field1773 = new long[arg0];
            } else {
                System.arraycopy(this.field1773, 0, this.field1773 = new long[arg0], 0, this.field1772);
            }
        }
        if (this.field1762) {
            if (this.field1783 == null) {
                this.field1783 = new String[arg0];
            } else {
                System.arraycopy(this.field1783, 0, this.field1783 = new String[arg0], 0, this.field1772);
            }
        }
        if (this.field1766 == null) {
            this.field1766 = new byte[arg0];
        } else {
            System.arraycopy(this.field1766, 0, this.field1766 = new byte[arg0], 0, this.field1772);
        }
        if (this.field1776 == null) {
            this.field1776 = new int[arg0];
        } else {
            System.arraycopy(this.field1776, 0, this.field1776 = new int[arg0], 0, this.field1772);
        }
        if (this.field1777 == null) {
            this.field1777 = new int[arg0];
        } else {
            System.arraycopy(this.field1777, 0, this.field1777 = new int[arg0], 0, this.field1772);
        }
        if (this.field1778 == null) {
            this.field1778 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1778, 0, this.field1778 = new boolean[arg0], 0, this.field1772);
        }
    }

    @ObfuscatedName("gc.al(IB)V")
    public void method3122(int arg0) {
        if (this.field1761) {
            if (this.field1782 == null) {
                this.field1782 = new long[arg0];
            } else {
                System.arraycopy(this.field1782, 0, this.field1782 = new long[arg0], 0, this.field1767);
            }
        }
        if (!this.field1762) {
            return;
        }
        if (this.field1784 == null) {
            this.field1784 = new String[arg0];
        } else {
            System.arraycopy(this.field1784, 0, this.field1784 = new String[arg0], 0, this.field1767);
        }
    }

    @ObfuscatedName("gc.aj(Ljava/lang/String;I)I")
    public int method3127(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1772; var2++) {
            if (this.field1783[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gc.az(IIII)I")
    public int method3173(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1776[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gc.af(II)Ljava/lang/Integer;")
    public Integer method3167(int arg0) {
        if (this.field1760 == null) {
            return null;
        } else {
            class504 var2 = this.field1760.method8506((long) arg0);
            return var2 != null && var2 instanceof class503 ? Integer.valueOf(((class503) var2).field5047) : null;
        }
    }

    @ObfuscatedName("gc.aa(I)[I")
    public int[] method3111() {
        if (this.field1775 == null) {
            String[] var1 = new String[this.field1772];
            this.field1775 = new int[this.field1772];
            int var2 = 0;
            while (var2 < this.field1772) {
                var1[var2] = this.field1783[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1775[var2] = var2++;
            }
            class541.method2117(var1, this.field1775);
        }
        return this.field1775;
    }

    @ObfuscatedName("gc.at(JLjava/lang/String;II)V")
    public void method3112(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1761) {
            throw new RuntimeException("");
        } else if (this.field1762 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1773 == null || this.field1772 >= this.field1773.length) || arg1 != null && (this.field1783 == null || this.field1772 >= this.field1783.length)) {
                this.method3106(this.field1772 + 5);
            }
            if (this.field1773 != null) {
                this.field1773[this.field1772] = arg0;
            }
            if (this.field1783 != null) {
                this.field1783[this.field1772] = arg1;
            }
            if (this.field1779 == -1) {
                this.field1779 = this.field1772;
                this.field1766[this.field1772] = 126;
            } else {
                this.field1766[this.field1772] = 0;
            }
            this.field1776[this.field1772] = 0;
            this.field1777[this.field1772] = arg2;
            this.field1778[this.field1772] = false;
            this.field1772++;
            this.field1775 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gc.ab(II)V")
    public void method3113(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1772) {
            throw new RuntimeException("");
        }
        this.field1772--;
        this.field1775 = null;
        if (this.field1772 == 0) {
            this.field1773 = null;
            this.field1783 = null;
            this.field1766 = null;
            this.field1776 = null;
            this.field1777 = null;
            this.field1778 = null;
            this.field1779 = -1;
            this.field1780 = -1;
            return;
        }
        System.arraycopy(this.field1766, arg0 + 1, this.field1766, arg0, this.field1772 - arg0);
        System.arraycopy(this.field1776, arg0 + 1, this.field1776, arg0, this.field1772 - arg0);
        System.arraycopy(this.field1777, arg0 + 1, this.field1777, arg0, this.field1772 - arg0);
        System.arraycopy(this.field1778, arg0 + 1, this.field1778, arg0, this.field1772 - arg0);
        if (this.field1773 != null) {
            System.arraycopy(this.field1773, arg0 + 1, this.field1773, arg0, this.field1772 - arg0);
        }
        if (this.field1783 != null) {
            System.arraycopy(this.field1783, arg0 + 1, this.field1783, arg0, this.field1772 - arg0);
        }
        this.method3158();
    }

    @ObfuscatedName("gc.ac(I)V")
    public void method3158() {
        if (this.field1772 == 0) {
            this.field1779 = -1;
            this.field1780 = -1;
            return;
        }
        this.field1779 = -1;
        this.field1780 = -1;
        int var1 = 0;
        byte var2 = this.field1766[0];
        for (int var3 = 1; var3 < this.field1772; var3++) {
            if (this.field1766[var3] > var2) {
                if (var2 == 125) {
                    this.field1780 = var1;
                }
                var1 = var3;
                var2 = this.field1766[var3];
            } else if (this.field1780 == -1 && this.field1766[var3] == 125) {
                this.field1780 = var3;
            }
        }
        this.field1779 = var1;
        if (this.field1779 != -1) {
            this.field1766[this.field1779] = 126;
        }
    }

    @ObfuscatedName("gc.ao(JLjava/lang/String;I)V")
    public void method3115(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1761 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1762) {
            if (arg0 > 0L && (this.field1782 == null || this.field1767 >= this.field1782.length) || arg1 != null && (this.field1784 == null || this.field1767 >= this.field1784.length)) {
                this.method3122(this.field1767 + 5);
            }
            if (this.field1782 != null) {
                this.field1782[this.field1767] = arg0;
            }
            if (this.field1784 != null) {
                this.field1784[this.field1767] = arg1;
            }
            this.field1767++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gc.ah(II)V")
    public void method3116(int arg0) {
        this.field1767--;
        if (this.field1767 == 0) {
            this.field1782 = null;
            this.field1784 = null;
            return;
        }
        if (this.field1782 != null) {
            System.arraycopy(this.field1782, arg0 + 1, this.field1782, arg0, this.field1767 - arg0);
        }
        if (this.field1784 != null) {
            System.arraycopy(this.field1784, arg0 + 1, this.field1784, arg0, this.field1767 - arg0);
        }
    }

    @ObfuscatedName("gc.av(IBB)I")
    public int method3117(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1779 == arg0 && (this.field1780 == -1 || this.field1766[this.field1780] < 125)) {
            return -1;
        } else if (this.field1766[arg0] == arg1) {
            return -1;
        } else {
            this.field1766[arg0] = arg1;
            this.method3158();
            return arg0;
        }
    }

    @ObfuscatedName("gc.aq(II)Z")
    public boolean method3157(int arg0) {
        if (this.field1779 == arg0 || this.field1766[arg0] == 126) {
            return false;
        }
        this.field1766[this.field1779] = 125;
        this.field1780 = this.field1779;
        this.field1766[arg0] = 126;
        this.field1779 = arg0;
        return true;
    }

    @ObfuscatedName("gc.ap(IZB)I")
    public int method3110(int arg0, boolean arg1) {
        if (this.field1778[arg0] == arg1) {
            return -1;
        } else {
            this.field1778[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gc.ae(IIIIB)I")
    public int method3120(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1776[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1776[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gc.ax(III)Z")
    public boolean method3162(int arg0, int arg1) {
        if (this.field1760 == null) {
            this.field1760 = new class519(4);
        } else {
            class504 var3 = this.field1760.method8506((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class503) {
                    class503 var4 = (class503) var3;
                    if (var4.field5047 == arg1) {
                        return false;
                    }
                    var4.field5047 = arg1;
                    return true;
                }
                var3.method8189();
            }
        }
        this.field1760.method8513(new class503(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gc.ay(IIIIB)Z")
    public boolean method3133(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1760 == null) {
            this.field1760 = new class519(4);
        } else {
            class504 var10 = this.field1760.method8506((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class503) {
                    class503 var11 = (class503) var10;
                    if ((var11.field5047 & var7) == var9) {
                        return false;
                    }
                    var11.field5047 &= ~var7;
                    var11.field5047 |= var9;
                    return true;
                }
                var10.method8189();
            }
        }
        this.field1760.method8513(new class503(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gc.au(IJ)Z")
    public boolean method3123(int arg0, long arg1) {
        if (this.field1760 == null) {
            this.field1760 = new class519(4);
        } else {
            class504 var4 = this.field1760.method8506((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class502) {
                    class502 var5 = (class502) var4;
                    if (var5.field5046 == arg1) {
                        return false;
                    }
                    var5.field5046 = arg1;
                    return true;
                }
                var4.method8189();
            }
        }
        this.field1760.method8513(new class502(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gc.as(ILjava/lang/String;I)Z")
    public boolean method3124(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1760 == null) {
            this.field1760 = new class519(4);
        } else {
            class504 var3 = this.field1760.method8506((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class501) {
                    class501 var4 = (class501) var3;
                    if (var4.field5045 instanceof String) {
                        if (arg1.equals(var4.field5045)) {
                            return false;
                        }
                        var4.method8189();
                        this.field1760.method8513(new class501(arg1), var4.field5049);
                        return true;
                    }
                }
                var3.method8189();
            }
        }
        this.field1760.method8513(new class501(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gc.aw(Lua;I)V")
    public void method3125(class546 arg0) {
        int var2 = arg0.method8796();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8796();
        if ((var3 & 0x1) != 0) {
            this.field1761 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1762 = true;
        }
        if (!this.field1761) {
            this.field1773 = null;
            this.field1782 = null;
        }
        if (!this.field1762) {
            this.field1783 = null;
            this.field1784 = null;
        }
        this.field1764 = arg0.method8801();
        this.field1765 = arg0.method8801();
        if (var2 <= 3 && this.field1765 != 0) {
            this.field1765 += 16912800;
        }
        this.field1772 = arg0.method8798();
        this.field1767 = arg0.method8796();
        this.field1770 = arg0.method8806();
        if (var2 >= 4) {
            arg0.method8801();
        }
        this.field1763 = arg0.method8796() == 1;
        this.field1768 = arg0.method8797();
        this.field1769 = arg0.method8797();
        this.field1774 = arg0.method8797();
        this.field1771 = arg0.method8797();
        if (this.field1772 > 0) {
            if (this.field1761 && (this.field1773 == null || this.field1773.length < this.field1772)) {
                this.field1773 = new long[this.field1772];
            }
            if (this.field1762 && (this.field1783 == null || this.field1783.length < this.field1772)) {
                this.field1783 = new String[this.field1772];
            }
            if (this.field1766 == null || this.field1766.length < this.field1772) {
                this.field1766 = new byte[this.field1772];
            }
            if (this.field1776 == null || this.field1776.length < this.field1772) {
                this.field1776 = new int[this.field1772];
            }
            if (this.field1777 == null || this.field1777.length < this.field1772) {
                this.field1777 = new int[this.field1772];
            }
            if (this.field1778 == null || this.field1778.length < this.field1772) {
                this.field1778 = new boolean[this.field1772];
            }
            for (int var4 = 0; var4 < this.field1772; var4++) {
                if (this.field1761) {
                    this.field1773[var4] = arg0.method8802();
                }
                if (this.field1762) {
                    this.field1783[var4] = arg0.method8805();
                }
                this.field1766[var4] = arg0.method8797();
                if (var2 >= 2) {
                    this.field1776[var4] = arg0.method8801();
                }
                if (var2 >= 5) {
                    this.field1777[var4] = arg0.method8798();
                } else {
                    this.field1777[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1778[var4] = arg0.method8796() == 1;
                } else {
                    this.field1778[var4] = false;
                }
            }
            this.method3158();
        }
        if (this.field1767 > 0) {
            if (this.field1761 && (this.field1782 == null || this.field1782.length < this.field1767)) {
                this.field1782 = new long[this.field1767];
            }
            if (this.field1762 && (this.field1784 == null || this.field1784.length < this.field1767)) {
                this.field1784 = new String[this.field1767];
            }
            for (int var5 = 0; var5 < this.field1767; var5++) {
                if (this.field1761) {
                    this.field1782[var5] = arg0.method8802();
                }
                if (this.field1762) {
                    this.field1784[var5] = arg0.method8805();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8798();
        if (var6 <= 0) {
            return;
        }
        this.field1760 = new class519(var6 < 16 ? Statics.method4498(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8801();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8801();
                this.field1760.method8513(new class503(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8802();
                this.field1760.method8513(new class502(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8806();
                this.field1760.method8513(new class501(var13), (long) var8);
            }
        }
    }
}
