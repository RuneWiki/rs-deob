package deob;

@ObfuscatedName("fi")
public class class155 {

    @ObfuscatedName("fi.ae")
    public boolean field1727;

    @ObfuscatedName("fi.ao")
    public boolean field1748;

    @ObfuscatedName("fi.at")
    public long field1729;

    @ObfuscatedName("fi.ac")
    public int field1746 = 0;

    @ObfuscatedName("fi.ai")
    public String field1734 = null;

    @ObfuscatedName("fi.az")
    public int field1732 = 0;

    @ObfuscatedName("fi.ap")
    public boolean field1733;

    @ObfuscatedName("fi.aa")
    public byte field1747;

    @ObfuscatedName("fi.af")
    public byte field1735;

    @ObfuscatedName("fi.ad")
    public byte field1736;

    @ObfuscatedName("fi.aq")
    public byte field1737;

    @ObfuscatedName("fi.al")
    public int field1738;

    @ObfuscatedName("fi.an")
    public long[] field1726;

    @ObfuscatedName("fi.ar")
    public byte[] field1740;

    @ObfuscatedName("fi.ab")
    public int[] field1741;

    @ObfuscatedName("fi.ag")
    public int[] field1742;

    @ObfuscatedName("fi.am")
    public int[] field1743;

    @ObfuscatedName("fi.ax")
    public boolean[] field1744;

    @ObfuscatedName("fi.ah")
    public int field1745 = -1;

    @ObfuscatedName("fi.as")
    public int field1730 = -1;

    @ObfuscatedName("fi.ay")
    public int field1731;

    @ObfuscatedName("fi.aj")
    public long[] field1739;

    @ObfuscatedName("fi.av")
    public String[] field1749;

    @ObfuscatedName("fi.aw")
    public String[] field1750;

    @ObfuscatedName("fi.ak")
    public class488 field1751;

    public class155(class515 arg0) {
        this.method3026(arg0);
    }

    @ObfuscatedName("fi.au(II)V")
    public void method2988(int arg0) {
        if (this.field1727) {
            if (this.field1726 == null) {
                this.field1726 = new long[arg0];
            } else {
                System.arraycopy(this.field1726, 0, this.field1726 = new long[arg0], 0, this.field1738);
            }
        }
        if (this.field1748) {
            if (this.field1749 == null) {
                this.field1749 = new String[arg0];
            } else {
                System.arraycopy(this.field1749, 0, this.field1749 = new String[arg0], 0, this.field1738);
            }
        }
        if (this.field1740 == null) {
            this.field1740 = new byte[arg0];
        } else {
            System.arraycopy(this.field1740, 0, this.field1740 = new byte[arg0], 0, this.field1738);
        }
        if (this.field1742 == null) {
            this.field1742 = new int[arg0];
        } else {
            System.arraycopy(this.field1742, 0, this.field1742 = new int[arg0], 0, this.field1738);
        }
        if (this.field1743 == null) {
            this.field1743 = new int[arg0];
        } else {
            System.arraycopy(this.field1743, 0, this.field1743 = new int[arg0], 0, this.field1738);
        }
        if (this.field1744 == null) {
            this.field1744 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1744, 0, this.field1744 = new boolean[arg0], 0, this.field1738);
        }
    }

    @ObfuscatedName("fi.ae(IB)V")
    public void method2991(int arg0) {
        if (this.field1727) {
            if (this.field1739 == null) {
                this.field1739 = new long[arg0];
            } else {
                System.arraycopy(this.field1739, 0, this.field1739 = new long[arg0], 0, this.field1731);
            }
        }
        if (!this.field1748) {
            return;
        }
        if (this.field1750 == null) {
            this.field1750 = new String[arg0];
        } else {
            System.arraycopy(this.field1750, 0, this.field1750 = new String[arg0], 0, this.field1731);
        }
    }

    @ObfuscatedName("fi.ao(Ljava/lang/String;I)I")
    public int method2999(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1738; var2++) {
            if (this.field1749[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("fi.at(IIII)I")
    public int method3001(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1742[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("fi.ac(II)Ljava/lang/Integer;")
    public Integer method2992(int arg0) {
        if (this.field1751 == null) {
            return null;
        } else {
            class473 var2 = this.field1751.method8008((long) arg0);
            return var2 != null && var2 instanceof class472 ? Integer.valueOf(((class472) var2).field4812) : null;
        }
    }

    @ObfuscatedName("fi.ai(I)[I")
    public int[] method2993() {
        if (this.field1741 == null) {
            String[] var1 = new String[this.field1738];
            this.field1741 = new int[this.field1738];
            int var2 = 0;
            while (var2 < this.field1738) {
                var1[var2] = this.field1749[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1741[var2] = var2++;
            }
            int[] var3 = this.field1741;
            class510.method3458(var1, var3, 0, var1.length - 1);
        }
        return this.field1741;
    }

    @ObfuscatedName("fi.az(JLjava/lang/String;IB)V")
    public void method3033(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1727 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1748 == (arg1 != null)) {
            if (arg0 > 0L && (this.field1726 == null || this.field1738 >= this.field1726.length) || arg1 != null && (this.field1749 == null || this.field1738 >= this.field1749.length)) {
                this.method2988(this.field1738 + 5);
            }
            if (this.field1726 != null) {
                this.field1726[this.field1738] = arg0;
            }
            if (this.field1749 != null) {
                this.field1749[this.field1738] = arg1;
            }
            if (this.field1745 == -1) {
                this.field1745 = this.field1738;
                this.field1740[this.field1738] = 126;
            } else {
                this.field1740[this.field1738] = 0;
            }
            this.field1742[this.field1738] = 0;
            this.field1743[this.field1738] = arg2;
            this.field1744[this.field1738] = false;
            this.field1738++;
            this.field1741 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fi.ap(IB)V")
    public void method2995(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1738) {
            throw new RuntimeException("");
        }
        this.field1738--;
        this.field1741 = null;
        if (this.field1738 == 0) {
            this.field1726 = null;
            this.field1749 = null;
            this.field1740 = null;
            this.field1742 = null;
            this.field1743 = null;
            this.field1744 = null;
            this.field1745 = -1;
            this.field1730 = -1;
            return;
        }
        System.arraycopy(this.field1740, arg0 + 1, this.field1740, arg0, this.field1738 - arg0);
        System.arraycopy(this.field1742, arg0 + 1, this.field1742, arg0, this.field1738 - arg0);
        System.arraycopy(this.field1743, arg0 + 1, this.field1743, arg0, this.field1738 - arg0);
        System.arraycopy(this.field1744, arg0 + 1, this.field1744, arg0, this.field1738 - arg0);
        if (this.field1726 != null) {
            System.arraycopy(this.field1726, arg0 + 1, this.field1726, arg0, this.field1738 - arg0);
        }
        if (this.field1749 != null) {
            System.arraycopy(this.field1749, arg0 + 1, this.field1749, arg0, this.field1738 - arg0);
        }
        this.method3044();
    }

    @ObfuscatedName("fi.aa(I)V")
    public void method3044() {
        if (this.field1738 == 0) {
            this.field1745 = -1;
            this.field1730 = -1;
            return;
        }
        this.field1745 = -1;
        this.field1730 = -1;
        int var1 = 0;
        byte var2 = this.field1740[0];
        for (int var3 = 1; var3 < this.field1738; var3++) {
            if (this.field1740[var3] > var2) {
                if (var2 == 125) {
                    this.field1730 = var1;
                }
                var1 = var3;
                var2 = this.field1740[var3];
            } else if (this.field1730 == -1 && this.field1740[var3] == 125) {
                this.field1730 = var3;
            }
        }
        this.field1745 = var1;
        if (this.field1745 != -1) {
            this.field1740[this.field1745] = 126;
        }
    }

    @ObfuscatedName("fi.af(JLjava/lang/String;I)V")
    public void method2997(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1727 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1748) {
            if (arg0 > 0L && (this.field1739 == null || this.field1731 >= this.field1739.length) || arg1 != null && (this.field1750 == null || this.field1731 >= this.field1750.length)) {
                this.method2991(this.field1731 + 5);
            }
            if (this.field1739 != null) {
                this.field1739[this.field1731] = arg0;
            }
            if (this.field1750 != null) {
                this.field1750[this.field1731] = arg1;
            }
            this.field1731++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("fi.ad(II)V")
    public void method2998(int arg0) {
        this.field1731--;
        if (this.field1731 == 0) {
            this.field1739 = null;
            this.field1750 = null;
            return;
        }
        if (this.field1739 != null) {
            System.arraycopy(this.field1739, arg0 + 1, this.field1739, arg0, this.field1731 - arg0);
        }
        if (this.field1750 != null) {
            System.arraycopy(this.field1750, arg0 + 1, this.field1750, arg0, this.field1731 - arg0);
        }
    }

    @ObfuscatedName("fi.aq(IBB)I")
    public int method3040(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1745 == arg0 && (this.field1730 == -1 || this.field1740[this.field1730] < 125)) {
            return -1;
        } else if (this.field1740[arg0] == arg1) {
            return -1;
        } else {
            this.field1740[arg0] = arg1;
            this.method3044();
            return arg0;
        }
    }

    @ObfuscatedName("fi.al(II)Z")
    public boolean method3000(int arg0) {
        if (this.field1745 == arg0 || this.field1740[arg0] == 126) {
            return false;
        }
        this.field1740[this.field1745] = 125;
        this.field1730 = this.field1745;
        this.field1740[arg0] = 126;
        this.field1745 = arg0;
        return true;
    }

    @ObfuscatedName("fi.an(IZI)I")
    public int method3042(int arg0, boolean arg1) {
        if (this.field1744[arg0] == arg1) {
            return -1;
        } else {
            this.field1744[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("fi.ar(IIIII)I")
    public int method3002(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1742[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1742[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("fi.ab(III)Z")
    public boolean method2987(int arg0, int arg1) {
        if (this.field1751 == null) {
            this.field1751 = new class488(4);
        } else {
            class473 var3 = this.field1751.method8008((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class472) {
                    class472 var4 = (class472) var3;
                    if (var4.field4812 == arg1) {
                        return false;
                    }
                    var4.field4812 = arg1;
                    return true;
                }
                var3.method7700();
            }
        }
        this.field1751.method8016(new class472(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.ag(IIIIB)Z")
    public boolean method3004(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1751 == null) {
            this.field1751 = new class488(4);
        } else {
            class473 var10 = this.field1751.method8008((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class472) {
                    class472 var11 = (class472) var10;
                    if ((var11.field4812 & var7) == var9) {
                        return false;
                    }
                    var11.field4812 &= ~var7;
                    var11.field4812 |= var9;
                    return true;
                }
                var10.method7700();
            }
        }
        this.field1751.method8016(new class472(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.am(IJ)Z")
    public boolean method3005(int arg0, long arg1) {
        if (this.field1751 == null) {
            this.field1751 = new class488(4);
        } else {
            class473 var4 = this.field1751.method8008((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class471) {
                    class471 var5 = (class471) var4;
                    if (var5.field4811 == arg1) {
                        return false;
                    }
                    var5.field4811 = arg1;
                    return true;
                }
                var4.method7700();
            }
        }
        this.field1751.method8016(new class471(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.ax(ILjava/lang/String;I)Z")
    public boolean method3006(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1751 == null) {
            this.field1751 = new class488(4);
        } else {
            class473 var3 = this.field1751.method8008((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class470) {
                    class470 var4 = (class470) var3;
                    if (var4.field4810 instanceof String) {
                        if (arg1.equals(var4.field4810)) {
                            return false;
                        }
                        var4.method7700();
                        this.field1751.method8016(new class470(arg1), var4.field4814);
                        return true;
                    }
                }
                var3.method7700();
            }
        }
        this.field1751.method8016(new class470(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("fi.ah(Ltm;I)V")
    public void method3026(class515 arg0) {
        int var2 = arg0.method8300();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8300();
        if ((var3 & 0x1) != 0) {
            this.field1727 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1748 = true;
        }
        if (!this.field1727) {
            this.field1726 = null;
            this.field1739 = null;
        }
        if (!this.field1748) {
            this.field1749 = null;
            this.field1750 = null;
        }
        this.field1746 = arg0.method8306();
        this.field1732 = arg0.method8306();
        if (var2 <= 3 && this.field1732 != 0) {
            this.field1732 += 16912800;
        }
        this.field1738 = arg0.method8448();
        this.field1731 = arg0.method8300();
        this.field1734 = arg0.method8311();
        if (var2 >= 4) {
            arg0.method8306();
        }
        this.field1733 = arg0.method8300() == 1;
        this.field1747 = arg0.method8301();
        this.field1735 = arg0.method8301();
        this.field1736 = arg0.method8301();
        this.field1737 = arg0.method8301();
        if (this.field1738 > 0) {
            if (this.field1727 && (this.field1726 == null || this.field1726.length < this.field1738)) {
                this.field1726 = new long[this.field1738];
            }
            if (this.field1748 && (this.field1749 == null || this.field1749.length < this.field1738)) {
                this.field1749 = new String[this.field1738];
            }
            if (this.field1740 == null || this.field1740.length < this.field1738) {
                this.field1740 = new byte[this.field1738];
            }
            if (this.field1742 == null || this.field1742.length < this.field1738) {
                this.field1742 = new int[this.field1738];
            }
            if (this.field1743 == null || this.field1743.length < this.field1738) {
                this.field1743 = new int[this.field1738];
            }
            if (this.field1744 == null || this.field1744.length < this.field1738) {
                this.field1744 = new boolean[this.field1738];
            }
            for (int var4 = 0; var4 < this.field1738; var4++) {
                if (this.field1727) {
                    this.field1726[var4] = arg0.method8307();
                }
                if (this.field1748) {
                    this.field1749[var4] = arg0.method8497();
                }
                this.field1740[var4] = arg0.method8301();
                if (var2 >= 2) {
                    this.field1742[var4] = arg0.method8306();
                }
                if (var2 >= 5) {
                    this.field1743[var4] = arg0.method8448();
                } else {
                    this.field1743[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1744[var4] = arg0.method8300() == 1;
                } else {
                    this.field1744[var4] = false;
                }
            }
            this.method3044();
        }
        if (this.field1731 > 0) {
            if (this.field1727 && (this.field1739 == null || this.field1739.length < this.field1731)) {
                this.field1739 = new long[this.field1731];
            }
            if (this.field1748 && (this.field1750 == null || this.field1750.length < this.field1731)) {
                this.field1750 = new String[this.field1731];
            }
            for (int var5 = 0; var5 < this.field1731; var5++) {
                if (this.field1727) {
                    this.field1739[var5] = arg0.method8307();
                }
                if (this.field1748) {
                    this.field1750[var5] = arg0.method8497();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8448();
        if (var6 <= 0) {
            return;
        }
        this.field1751 = new class488(var6 < 16 ? class304.method4709(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8306();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8306();
                this.field1751.method8016(new class472(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8307();
                this.field1751.method8016(new class471(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8311();
                this.field1751.method8016(new class470(var13), (long) var8);
            }
        }
    }
}
