package deob;

@ObfuscatedName("gk")
public class class159 {

    @ObfuscatedName("gk.ad")
    public boolean field1760;

    @ObfuscatedName("gk.ag")
    public boolean field1759;

    @ObfuscatedName("gk.ak")
    public long field1762;

    @ObfuscatedName("gk.ap")
    public int field1763 = 0;

    @ObfuscatedName("gk.an")
    public String field1778 = null;

    @ObfuscatedName("gk.aj")
    public int field1781 = 0;

    @ObfuscatedName("gk.av")
    public boolean field1779;

    @ObfuscatedName("gk.ab")
    public byte field1767;

    @ObfuscatedName("gk.ai")
    public byte field1768;

    @ObfuscatedName("gk.ae")
    public byte field1769;

    @ObfuscatedName("gk.au")
    public byte field1770;

    @ObfuscatedName("gk.ah")
    public int field1771;

    @ObfuscatedName("gk.az")
    public long[] field1772;

    @ObfuscatedName("gk.ax")
    public byte[] field1773;

    @ObfuscatedName("gk.ac")
    public int[] field1764;

    @ObfuscatedName("gk.al")
    public int[] field1784;

    @ObfuscatedName("gk.ay")
    public int[] field1775;

    @ObfuscatedName("gk.ao")
    public boolean[] field1777;

    @ObfuscatedName("gk.aa")
    public int field1776 = -1;

    @ObfuscatedName("gk.as")
    public int field1785 = -1;

    @ObfuscatedName("gk.aw")
    public int field1780;

    @ObfuscatedName("gk.at")
    public long[] field1774;

    @ObfuscatedName("gk.af")
    public String[] field1782;

    @ObfuscatedName("gk.am")
    public String[] field1783;

    @ObfuscatedName("gk.ar")
    public class520 field1766;

    public class159(class547 arg0) {
        this.method3136(arg0);
    }

    @ObfuscatedName("gk.aq(IB)V")
    public void method3117(int arg0) {
        if (this.field1760) {
            if (this.field1772 == null) {
                this.field1772 = new long[arg0];
            } else {
                System.arraycopy(this.field1772, 0, this.field1772 = new long[arg0], 0, this.field1771);
            }
        }
        if (this.field1759) {
            if (this.field1782 == null) {
                this.field1782 = new String[arg0];
            } else {
                System.arraycopy(this.field1782, 0, this.field1782 = new String[arg0], 0, this.field1771);
            }
        }
        if (this.field1773 == null) {
            this.field1773 = new byte[arg0];
        } else {
            System.arraycopy(this.field1773, 0, this.field1773 = new byte[arg0], 0, this.field1771);
        }
        if (this.field1784 == null) {
            this.field1784 = new int[arg0];
        } else {
            System.arraycopy(this.field1784, 0, this.field1784 = new int[arg0], 0, this.field1771);
        }
        if (this.field1775 == null) {
            this.field1775 = new int[arg0];
        } else {
            System.arraycopy(this.field1775, 0, this.field1775 = new int[arg0], 0, this.field1771);
        }
        if (this.field1777 == null) {
            this.field1777 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1777, 0, this.field1777 = new boolean[arg0], 0, this.field1771);
        }
    }

    @ObfuscatedName("gk.ad(II)V")
    public void method3168(int arg0) {
        if (this.field1760) {
            if (this.field1774 == null) {
                this.field1774 = new long[arg0];
            } else {
                System.arraycopy(this.field1774, 0, this.field1774 = new long[arg0], 0, this.field1780);
            }
        }
        if (!this.field1759) {
            return;
        }
        if (this.field1783 == null) {
            this.field1783 = new String[arg0];
        } else {
            System.arraycopy(this.field1783, 0, this.field1783 = new String[arg0], 0, this.field1780);
        }
    }

    @ObfuscatedName("gk.ag(Ljava/lang/String;I)I")
    public int method3177(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1771; var2++) {
            if (this.field1782[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gk.ak(IIII)I")
    public int method3120(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1784[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gk.ap(IB)Ljava/lang/Integer;")
    public Integer method3121(int arg0) {
        if (this.field1766 == null) {
            return null;
        } else {
            class505 var2 = this.field1766.method8442((long) arg0);
            return var2 != null && var2 instanceof class504 ? Integer.valueOf(((class504) var2).field5080) : null;
        }
    }

    @ObfuscatedName("gk.an(I)[I")
    public int[] method3153() {
        if (this.field1764 == null) {
            String[] var1 = new String[this.field1771];
            this.field1764 = new int[this.field1771];
            int var2 = 0;
            while (var2 < this.field1771) {
                var1[var2] = this.field1782[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1764[var2] = var2++;
            }
            class542.method3324(var1, this.field1764);
        }
        return this.field1764;
    }

    @ObfuscatedName("gk.aj(JLjava/lang/String;II)V")
    public void method3146(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field1760) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1759) {
            if (arg0 > 0L && (this.field1772 == null || this.field1771 >= this.field1772.length) || arg1 != null && (this.field1782 == null || this.field1771 >= this.field1782.length)) {
                this.method3117(this.field1771 + 5);
            }
            if (this.field1772 != null) {
                this.field1772[this.field1771] = arg0;
            }
            if (this.field1782 != null) {
                this.field1782[this.field1771] = arg1;
            }
            if (this.field1776 == -1) {
                this.field1776 = this.field1771;
                this.field1773[this.field1771] = 126;
            } else {
                this.field1773[this.field1771] = 0;
            }
            this.field1784[this.field1771] = 0;
            this.field1775[this.field1771] = arg2;
            this.field1777[this.field1771] = false;
            this.field1771++;
            this.field1764 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gk.av(II)V")
    public void method3158(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1771) {
            throw new RuntimeException("");
        }
        this.field1771--;
        this.field1764 = null;
        if (this.field1771 == 0) {
            this.field1772 = null;
            this.field1782 = null;
            this.field1773 = null;
            this.field1784 = null;
            this.field1775 = null;
            this.field1777 = null;
            this.field1776 = -1;
            this.field1785 = -1;
            return;
        }
        System.arraycopy(this.field1773, arg0 + 1, this.field1773, arg0, this.field1771 - arg0);
        System.arraycopy(this.field1784, arg0 + 1, this.field1784, arg0, this.field1771 - arg0);
        System.arraycopy(this.field1775, arg0 + 1, this.field1775, arg0, this.field1771 - arg0);
        System.arraycopy(this.field1777, arg0 + 1, this.field1777, arg0, this.field1771 - arg0);
        if (this.field1772 != null) {
            System.arraycopy(this.field1772, arg0 + 1, this.field1772, arg0, this.field1771 - arg0);
        }
        if (this.field1782 != null) {
            System.arraycopy(this.field1782, arg0 + 1, this.field1782, arg0, this.field1771 - arg0);
        }
        this.method3125();
    }

    @ObfuscatedName("gk.ab(I)V")
    public void method3125() {
        if (this.field1771 == 0) {
            this.field1776 = -1;
            this.field1785 = -1;
            return;
        }
        this.field1776 = -1;
        this.field1785 = -1;
        int var1 = 0;
        byte var2 = this.field1773[0];
        for (int var3 = 1; var3 < this.field1771; var3++) {
            if (this.field1773[var3] > var2) {
                if (var2 == 125) {
                    this.field1785 = var1;
                }
                var1 = var3;
                var2 = this.field1773[var3];
            } else if (this.field1785 == -1 && this.field1773[var3] == 125) {
                this.field1785 = var3;
            }
        }
        this.field1776 = var1;
        if (this.field1776 != -1) {
            this.field1773[this.field1776] = 126;
        }
    }

    @ObfuscatedName("gk.ai(JLjava/lang/String;I)V")
    public void method3126(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1760 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1759) {
            if (arg0 > 0L && (this.field1774 == null || this.field1780 >= this.field1774.length) || arg1 != null && (this.field1783 == null || this.field1780 >= this.field1783.length)) {
                this.method3168(this.field1780 + 5);
            }
            if (this.field1774 != null) {
                this.field1774[this.field1780] = arg0;
            }
            if (this.field1783 != null) {
                this.field1783[this.field1780] = arg1;
            }
            this.field1780++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gk.ae(II)V")
    public void method3127(int arg0) {
        this.field1780--;
        if (this.field1780 == 0) {
            this.field1774 = null;
            this.field1783 = null;
            return;
        }
        if (this.field1774 != null) {
            System.arraycopy(this.field1774, arg0 + 1, this.field1774, arg0, this.field1780 - arg0);
        }
        if (this.field1783 != null) {
            System.arraycopy(this.field1783, arg0 + 1, this.field1783, arg0, this.field1780 - arg0);
        }
    }

    @ObfuscatedName("gk.au(IBB)I")
    public int method3128(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1776 == arg0 && (this.field1785 == -1 || this.field1773[this.field1785] < 125)) {
            return -1;
        } else if (this.field1773[arg0] == arg1) {
            return -1;
        } else {
            this.field1773[arg0] = arg1;
            this.method3125();
            return arg0;
        }
    }

    @ObfuscatedName("gk.ah(II)Z")
    public boolean method3137(int arg0) {
        if (this.field1776 == arg0 || this.field1773[arg0] == 126) {
            return false;
        }
        this.field1773[this.field1776] = 125;
        this.field1785 = this.field1776;
        this.field1773[arg0] = 126;
        this.field1776 = arg0;
        return true;
    }

    @ObfuscatedName("gk.az(IZI)I")
    public int method3116(int arg0, boolean arg1) {
        if (this.field1777[arg0] == arg1) {
            return -1;
        } else {
            this.field1777[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gk.ax(IIIII)I")
    public int method3131(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1784[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1784[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gk.ac(IIB)Z")
    public boolean method3132(int arg0, int arg1) {
        if (this.field1766 == null) {
            this.field1766 = new class520(4);
        } else {
            class505 var3 = this.field1766.method8442((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class504) {
                    class504 var4 = (class504) var3;
                    if (var4.field5080 == arg1) {
                        return false;
                    }
                    var4.field5080 = arg1;
                    return true;
                }
                var3.method8130();
            }
        }
        this.field1766.method8443(new class504(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gk.al(IIIII)Z")
    public boolean method3133(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1766 == null) {
            this.field1766 = new class520(4);
        } else {
            class505 var10 = this.field1766.method8442((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class504) {
                    class504 var11 = (class504) var10;
                    if ((var11.field5080 & var7) == var9) {
                        return false;
                    }
                    var11.field5080 &= ~var7;
                    var11.field5080 |= var9;
                    return true;
                }
                var10.method8130();
            }
        }
        this.field1766.method8443(new class504(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gk.ay(IJ)Z")
    public boolean method3134(int arg0, long arg1) {
        if (this.field1766 == null) {
            this.field1766 = new class520(4);
        } else {
            class505 var4 = this.field1766.method8442((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class503) {
                    class503 var5 = (class503) var4;
                    if (var5.field5079 == arg1) {
                        return false;
                    }
                    var5.field5079 = arg1;
                    return true;
                }
                var4.method8130();
            }
        }
        this.field1766.method8443(new class503(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gk.ao(ILjava/lang/String;B)Z")
    public boolean method3135(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1766 == null) {
            this.field1766 = new class520(4);
        } else {
            class505 var3 = this.field1766.method8442((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class502) {
                    class502 var4 = (class502) var3;
                    if (var4.field5078 instanceof String) {
                        if (arg1.equals(var4.field5078)) {
                            return false;
                        }
                        var4.method8130();
                        this.field1766.method8443(new class502(arg1), var4.field5082);
                        return true;
                    }
                }
                var3.method8130();
            }
        }
        this.field1766.method8443(new class502(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gk.aa(Lvp;I)V")
    public void method3136(class547 arg0) {
        int var2 = arg0.method8804();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8804();
        if ((var3 & 0x1) != 0) {
            this.field1760 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1759 = true;
        }
        if (!this.field1760) {
            this.field1772 = null;
            this.field1774 = null;
        }
        if (!this.field1759) {
            this.field1782 = null;
            this.field1783 = null;
        }
        this.field1763 = arg0.method8734();
        this.field1781 = arg0.method8734();
        if (var2 <= 3 && this.field1781 != 0) {
            this.field1781 += 16912800;
        }
        this.field1771 = arg0.method8899();
        this.field1780 = arg0.method8804();
        this.field1778 = arg0.method8739();
        if (var2 >= 4) {
            arg0.method8734();
        }
        this.field1779 = arg0.method8804() == 1;
        this.field1767 = arg0.method8857();
        this.field1768 = arg0.method8857();
        this.field1769 = arg0.method8857();
        this.field1770 = arg0.method8857();
        if (this.field1771 > 0) {
            if (this.field1760 && (this.field1772 == null || this.field1772.length < this.field1771)) {
                this.field1772 = new long[this.field1771];
            }
            if (this.field1759 && (this.field1782 == null || this.field1782.length < this.field1771)) {
                this.field1782 = new String[this.field1771];
            }
            if (this.field1773 == null || this.field1773.length < this.field1771) {
                this.field1773 = new byte[this.field1771];
            }
            if (this.field1784 == null || this.field1784.length < this.field1771) {
                this.field1784 = new int[this.field1771];
            }
            if (this.field1775 == null || this.field1775.length < this.field1771) {
                this.field1775 = new int[this.field1771];
            }
            if (this.field1777 == null || this.field1777.length < this.field1771) {
                this.field1777 = new boolean[this.field1771];
            }
            for (int var4 = 0; var4 < this.field1771; var4++) {
                if (this.field1760) {
                    this.field1772[var4] = arg0.method8735();
                }
                if (this.field1759) {
                    this.field1782[var4] = arg0.method8738();
                }
                this.field1773[var4] = arg0.method8857();
                if (var2 >= 2) {
                    this.field1784[var4] = arg0.method8734();
                }
                if (var2 >= 5) {
                    this.field1775[var4] = arg0.method8899();
                } else {
                    this.field1775[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1777[var4] = arg0.method8804() == 1;
                } else {
                    this.field1777[var4] = false;
                }
            }
            this.method3125();
        }
        if (this.field1780 > 0) {
            if (this.field1760 && (this.field1774 == null || this.field1774.length < this.field1780)) {
                this.field1774 = new long[this.field1780];
            }
            if (this.field1759 && (this.field1783 == null || this.field1783.length < this.field1780)) {
                this.field1783 = new String[this.field1780];
            }
            for (int var5 = 0; var5 < this.field1780; var5++) {
                if (this.field1760) {
                    this.field1774[var5] = arg0.method8735();
                }
                if (this.field1759) {
                    this.field1783[var5] = arg0.method8738();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8899();
        if (var6 <= 0) {
            return;
        }
        this.field1766 = new class520(var6 < 16 ? class329.method6778(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8734();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8734();
                this.field1766.method8443(new class504(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8735();
                this.field1766.method8443(new class503(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8739();
                this.field1766.method8443(new class502(var13), (long) var8);
            }
        }
    }
}
