package deob;

@ObfuscatedName("gg")
public class class160 {

    @ObfuscatedName("gg.ay")
    public boolean field1732;

    @ObfuscatedName("gg.an")
    public boolean field1752;

    @ObfuscatedName("gg.au")
    public long field1734;

    @ObfuscatedName("gg.ax")
    public int field1735 = 0;

    @ObfuscatedName("gg.ao")
    public String field1744 = null;

    @ObfuscatedName("gg.am")
    public int field1737 = 0;

    @ObfuscatedName("gg.ac")
    public boolean field1731;

    @ObfuscatedName("gg.ae")
    public byte field1739;

    @ObfuscatedName("gg.ad")
    public byte field1758;

    @ObfuscatedName("gg.aq")
    public byte field1741;

    @ObfuscatedName("gg.al")
    public byte field1742;

    @ObfuscatedName("gg.aj")
    public int field1743;

    @ObfuscatedName("gg.as")
    public long[] field1733;

    @ObfuscatedName("gg.aw")
    public byte[] field1745;

    @ObfuscatedName("gg.af")
    public int[] field1746;

    @ObfuscatedName("gg.aa")
    public int[] field1747;

    @ObfuscatedName("gg.ah")
    public int[] field1748;

    @ObfuscatedName("gg.ag")
    public boolean[] field1749;

    @ObfuscatedName("gg.av")
    public int field1750 = -1;

    @ObfuscatedName("gg.ar")
    public int field1751 = -1;

    @ObfuscatedName("gg.ap")
    public int field1736;

    @ObfuscatedName("gg.ak")
    public long[] field1738;

    @ObfuscatedName("gg.ai")
    public String[] field1754;

    @ObfuscatedName("gg.at")
    public String[] field1755;

    @ObfuscatedName("gg.az")
    public class521 field1756;

    public class160(class549 arg0) {
        this.method3260(arg0);
    }

    @ObfuscatedName("gg.ab(IB)V")
    public void method3265(int arg0) {
        if (this.field1732) {
            if (this.field1733 == null) {
                this.field1733 = new long[arg0];
            } else {
                System.arraycopy(this.field1733, 0, this.field1733 = new long[arg0], 0, this.field1743);
            }
        }
        if (this.field1752) {
            if (this.field1754 == null) {
                this.field1754 = new String[arg0];
            } else {
                System.arraycopy(this.field1754, 0, this.field1754 = new String[arg0], 0, this.field1743);
            }
        }
        if (this.field1745 == null) {
            this.field1745 = new byte[arg0];
        } else {
            System.arraycopy(this.field1745, 0, this.field1745 = new byte[arg0], 0, this.field1743);
        }
        if (this.field1747 == null) {
            this.field1747 = new int[arg0];
        } else {
            System.arraycopy(this.field1747, 0, this.field1747 = new int[arg0], 0, this.field1743);
        }
        if (this.field1748 == null) {
            this.field1748 = new int[arg0];
        } else {
            System.arraycopy(this.field1748, 0, this.field1748 = new int[arg0], 0, this.field1743);
        }
        if (this.field1749 == null) {
            this.field1749 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1749, 0, this.field1749 = new boolean[arg0], 0, this.field1743);
        }
    }

    @ObfuscatedName("gg.ay(IB)V")
    public void method3227(int arg0) {
        if (this.field1732) {
            if (this.field1738 == null) {
                this.field1738 = new long[arg0];
            } else {
                System.arraycopy(this.field1738, 0, this.field1738 = new long[arg0], 0, this.field1736);
            }
        }
        if (!this.field1752) {
            return;
        }
        if (this.field1755 == null) {
            this.field1755 = new String[arg0];
        } else {
            System.arraycopy(this.field1755, 0, this.field1755 = new String[arg0], 0, this.field1736);
        }
    }

    @ObfuscatedName("gg.an(Ljava/lang/String;B)I")
    public int method3218(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1743; var2++) {
            if (this.field1754[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gg.au(IIII)I")
    public int method3264(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1747[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gg.ax(II)Ljava/lang/Integer;")
    public Integer method3220(int arg0) {
        if (this.field1756 == null) {
            return null;
        } else {
            class506 var2 = this.field1756.method8512((long) arg0);
            return var2 != null && var2 instanceof class505 ? Integer.valueOf(((class505) var2).field5073) : null;
        }
    }

    @ObfuscatedName("gg.ao(I)[I")
    public int[] method3221() {
        if (this.field1746 == null) {
            String[] var1 = new String[this.field1743];
            this.field1746 = new int[this.field1743];
            int var2 = 0;
            while (var2 < this.field1743) {
                var1[var2] = this.field1754[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1746[var2] = var2++;
            }
            class543.method666(var1, this.field1746);
        }
        return this.field1746;
    }

    @ObfuscatedName("gg.am(JLjava/lang/String;II)V")
    public void method3222(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1732 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1752 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1733 == null || this.field1743 >= this.field1733.length) || arg1 != null && (this.field1754 == null || this.field1743 >= this.field1754.length)) {
                this.method3265(this.field1743 + 5);
            }
            if (this.field1733 != null) {
                this.field1733[this.field1743] = arg0;
            }
            if (this.field1754 != null) {
                this.field1754[this.field1743] = arg1;
            }
            if (this.field1750 == -1) {
                this.field1750 = this.field1743;
                this.field1745[this.field1743] = 126;
            } else {
                this.field1745[this.field1743] = 0;
            }
            this.field1747[this.field1743] = 0;
            this.field1748[this.field1743] = arg2;
            this.field1749[this.field1743] = false;
            this.field1743++;
            this.field1746 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gg.ac(II)V")
    public void method3223(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1743) {
            throw new RuntimeException("");
        }
        this.field1743--;
        this.field1746 = null;
        if (this.field1743 == 0) {
            this.field1733 = null;
            this.field1754 = null;
            this.field1745 = null;
            this.field1747 = null;
            this.field1748 = null;
            this.field1749 = null;
            this.field1750 = -1;
            this.field1751 = -1;
            return;
        }
        System.arraycopy(this.field1745, arg0 + 1, this.field1745, arg0, this.field1743 - arg0);
        System.arraycopy(this.field1747, arg0 + 1, this.field1747, arg0, this.field1743 - arg0);
        System.arraycopy(this.field1748, arg0 + 1, this.field1748, arg0, this.field1743 - arg0);
        System.arraycopy(this.field1749, arg0 + 1, this.field1749, arg0, this.field1743 - arg0);
        if (this.field1733 != null) {
            System.arraycopy(this.field1733, arg0 + 1, this.field1733, arg0, this.field1743 - arg0);
        }
        if (this.field1754 != null) {
            System.arraycopy(this.field1754, arg0 + 1, this.field1754, arg0, this.field1743 - arg0);
        }
        this.method3224();
    }

    @ObfuscatedName("gg.ae(I)V")
    public void method3224() {
        if (this.field1743 == 0) {
            this.field1750 = -1;
            this.field1751 = -1;
            return;
        }
        this.field1750 = -1;
        this.field1751 = -1;
        int var1 = 0;
        byte var2 = this.field1745[0];
        for (int var3 = 1; var3 < this.field1743; var3++) {
            if (this.field1745[var3] > var2) {
                if (var2 == 125) {
                    this.field1751 = var1;
                }
                var1 = var3;
                var2 = this.field1745[var3];
            } else if (this.field1751 == -1 && this.field1745[var3] == 125) {
                this.field1751 = var3;
            }
        }
        this.field1750 = var1;
        if (this.field1750 != -1) {
            this.field1745[this.field1750] = 126;
        }
    }

    @ObfuscatedName("gg.ad(JLjava/lang/String;I)V")
    public void method3225(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1732 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1752 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1738 == null || this.field1736 >= this.field1738.length) || arg1 != null && (this.field1755 == null || this.field1736 >= this.field1755.length)) {
                this.method3227(this.field1736 + 5);
            }
            if (this.field1738 != null) {
                this.field1738[this.field1736] = arg0;
            }
            if (this.field1755 != null) {
                this.field1755[this.field1736] = arg1;
            }
            this.field1736++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gg.aq(II)V")
    public void method3226(int arg0) {
        this.field1736--;
        if (this.field1736 == 0) {
            this.field1738 = null;
            this.field1755 = null;
            return;
        }
        if (this.field1738 != null) {
            System.arraycopy(this.field1738, arg0 + 1, this.field1738, arg0, this.field1736 - arg0);
        }
        if (this.field1755 != null) {
            System.arraycopy(this.field1755, arg0 + 1, this.field1755, arg0, this.field1736 - arg0);
        }
    }

    @ObfuscatedName("gg.al(IBI)I")
    public int method3266(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1750 == arg0 && (this.field1751 == -1 || this.field1745[this.field1751] < 125)) {
            return -1;
        } else if (this.field1745[arg0] == arg1) {
            return -1;
        } else {
            this.field1745[arg0] = arg1;
            this.method3224();
            return arg0;
        }
    }

    @ObfuscatedName("gg.aj(II)Z")
    public boolean method3228(int arg0) {
        if (this.field1750 == arg0 || this.field1745[arg0] == 126) {
            return false;
        }
        this.field1745[this.field1750] = 125;
        this.field1751 = this.field1750;
        this.field1745[arg0] = 126;
        this.field1750 = arg0;
        return true;
    }

    @ObfuscatedName("gg.as(IZI)I")
    public int method3254(int arg0, boolean arg1) {
        if (this.field1749[arg0] == arg1) {
            return -1;
        } else {
            this.field1749[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gg.aw(IIIII)I")
    public int method3244(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1747[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1747[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gg.af(IIB)Z")
    public boolean method3231(int arg0, int arg1) {
        if (this.field1756 == null) {
            this.field1756 = new class521(4);
        } else {
            class506 var3 = this.field1756.method8512((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class505) {
                    class505 var4 = (class505) var3;
                    if (var4.field5073 == arg1) {
                        return false;
                    }
                    var4.field5073 = arg1;
                    return true;
                }
                var3.method8218();
            }
        }
        this.field1756.method8513(new class505(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gg.aa(IIIII)Z")
    public boolean method3232(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1756 == null) {
            this.field1756 = new class521(4);
        } else {
            class506 var10 = this.field1756.method8512((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class505) {
                    class505 var11 = (class505) var10;
                    if ((var11.field5073 & var7) == var9) {
                        return false;
                    }
                    var11.field5073 &= ~var7;
                    var11.field5073 |= var9;
                    return true;
                }
                var10.method8218();
            }
        }
        this.field1756.method8513(new class505(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gg.ah(IJ)Z")
    public boolean method3243(int arg0, long arg1) {
        if (this.field1756 == null) {
            this.field1756 = new class521(4);
        } else {
            class506 var4 = this.field1756.method8512((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class504) {
                    class504 var5 = (class504) var4;
                    if (var5.field5072 == arg1) {
                        return false;
                    }
                    var5.field5072 = arg1;
                    return true;
                }
                var4.method8218();
            }
        }
        this.field1756.method8513(new class504(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gg.ag(ILjava/lang/String;S)Z")
    public boolean method3252(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1756 == null) {
            this.field1756 = new class521(4);
        } else {
            class506 var3 = this.field1756.method8512((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class503) {
                    class503 var4 = (class503) var3;
                    if (var4.field5071 instanceof String) {
                        if (arg1.equals(var4.field5071)) {
                            return false;
                        }
                        var4.method8218();
                        this.field1756.method8513(new class503(arg1), var4.field5075);
                        return true;
                    }
                }
                var3.method8218();
            }
        }
        this.field1756.method8513(new class503(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gg.av(Lvg;I)V")
    public void method3260(class549 arg0) {
        int var2 = arg0.method9025();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method9025();
        if ((var3 & 0x1) != 0) {
            this.field1732 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1752 = true;
        }
        if (!this.field1732) {
            this.field1733 = null;
            this.field1738 = null;
        }
        if (!this.field1752) {
            this.field1754 = null;
            this.field1755 = null;
        }
        this.field1735 = arg0.method8803();
        this.field1737 = arg0.method8803();
        if (var2 <= 3 && this.field1737 != 0) {
            this.field1737 += 16912800;
        }
        this.field1743 = arg0.method8968();
        this.field1736 = arg0.method9025();
        this.field1744 = arg0.method8808();
        if (var2 >= 4) {
            arg0.method8803();
        }
        this.field1731 = arg0.method9025() == 1;
        this.field1739 = arg0.method8798();
        this.field1758 = arg0.method8798();
        this.field1741 = arg0.method8798();
        this.field1742 = arg0.method8798();
        if (this.field1743 > 0) {
            if (this.field1732 && (this.field1733 == null || this.field1733.length < this.field1743)) {
                this.field1733 = new long[this.field1743];
            }
            if (this.field1752 && (this.field1754 == null || this.field1754.length < this.field1743)) {
                this.field1754 = new String[this.field1743];
            }
            if (this.field1745 == null || this.field1745.length < this.field1743) {
                this.field1745 = new byte[this.field1743];
            }
            if (this.field1747 == null || this.field1747.length < this.field1743) {
                this.field1747 = new int[this.field1743];
            }
            if (this.field1748 == null || this.field1748.length < this.field1743) {
                this.field1748 = new int[this.field1743];
            }
            if (this.field1749 == null || this.field1749.length < this.field1743) {
                this.field1749 = new boolean[this.field1743];
            }
            for (int var4 = 0; var4 < this.field1743; var4++) {
                if (this.field1732) {
                    this.field1733[var4] = arg0.method8804();
                }
                if (this.field1752) {
                    this.field1754[var4] = arg0.method8807();
                }
                this.field1745[var4] = arg0.method8798();
                if (var2 >= 2) {
                    this.field1747[var4] = arg0.method8803();
                }
                if (var2 >= 5) {
                    this.field1748[var4] = arg0.method8968();
                } else {
                    this.field1748[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1749[var4] = arg0.method9025() == 1;
                } else {
                    this.field1749[var4] = false;
                }
            }
            this.method3224();
        }
        if (this.field1736 > 0) {
            if (this.field1732 && (this.field1738 == null || this.field1738.length < this.field1736)) {
                this.field1738 = new long[this.field1736];
            }
            if (this.field1752 && (this.field1755 == null || this.field1755.length < this.field1736)) {
                this.field1755 = new String[this.field1736];
            }
            for (int var5 = 0; var5 < this.field1736; var5++) {
                if (this.field1732) {
                    this.field1738[var5] = arg0.method8804();
                }
                if (this.field1752) {
                    this.field1755[var5] = arg0.method8807();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8968();
        if (var6 <= 0) {
            return;
        }
        this.field1756 = new class521(var6 < 16 ? class331.method5556(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8803();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8803();
                this.field1756.method8513(new class505(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8804();
                this.field1756.method8513(new class504(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8808();
                this.field1756.method8513(new class503(var13), (long) var8);
            }
        }
    }
}
