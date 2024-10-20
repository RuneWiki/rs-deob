package deob;

@ObfuscatedName("gt")
public class class157 {

    @ObfuscatedName("gt.aw")
    public boolean field1735;

    @ObfuscatedName("gt.al")
    public boolean field1736;

    @ObfuscatedName("gt.ai")
    public long field1745;

    @ObfuscatedName("gt.ar")
    public int field1755 = 0;

    @ObfuscatedName("gt.as")
    public String field1739 = null;

    @ObfuscatedName("gt.aa")
    public int field1753 = 0;

    @ObfuscatedName("gt.az")
    public boolean field1741;

    @ObfuscatedName("gt.ao")
    public byte field1747;

    @ObfuscatedName("gt.au")
    public byte field1749;

    @ObfuscatedName("gt.ak")
    public byte field1744;

    @ObfuscatedName("gt.ah")
    public byte field1743;

    @ObfuscatedName("gt.aj")
    public int field1746;

    @ObfuscatedName("gt.af")
    public long[] field1756;

    @ObfuscatedName("gt.ax")
    public byte[] field1748;

    @ObfuscatedName("gt.an")
    public int[] field1737;

    @ObfuscatedName("gt.ag")
    public int[] field1750;

    @ObfuscatedName("gt.am")
    public int[] field1751;

    @ObfuscatedName("gt.ad")
    public boolean[] field1752;

    @ObfuscatedName("gt.at")
    public int field1740 = -1;

    @ObfuscatedName("gt.ay")
    public int field1754 = -1;

    @ObfuscatedName("gt.ae")
    public int field1734;

    @ObfuscatedName("gt.ac")
    public long[] field1742;

    @ObfuscatedName("gt.ab")
    public String[] field1757;

    @ObfuscatedName("gt.av")
    public String[] field1758;

    @ObfuscatedName("gt.ap")
    public class507 field1759;

    public class157(class534 arg0) {
        this.method3092(arg0);
    }

    @ObfuscatedName("gt.aq(II)V")
    public void method3073(int arg0) {
        if (this.field1735) {
            if (this.field1756 == null) {
                this.field1756 = new long[arg0];
            } else {
                System.arraycopy(this.field1756, 0, this.field1756 = new long[arg0], 0, this.field1746);
            }
        }
        if (this.field1736) {
            if (this.field1757 == null) {
                this.field1757 = new String[arg0];
            } else {
                System.arraycopy(this.field1757, 0, this.field1757 = new String[arg0], 0, this.field1746);
            }
        }
        if (this.field1748 == null) {
            this.field1748 = new byte[arg0];
        } else {
            System.arraycopy(this.field1748, 0, this.field1748 = new byte[arg0], 0, this.field1746);
        }
        if (this.field1750 == null) {
            this.field1750 = new int[arg0];
        } else {
            System.arraycopy(this.field1750, 0, this.field1750 = new int[arg0], 0, this.field1746);
        }
        if (this.field1751 == null) {
            this.field1751 = new int[arg0];
        } else {
            System.arraycopy(this.field1751, 0, this.field1751 = new int[arg0], 0, this.field1746);
        }
        if (this.field1752 == null) {
            this.field1752 = new boolean[arg0];
        } else {
            System.arraycopy(this.field1752, 0, this.field1752 = new boolean[arg0], 0, this.field1746);
        }
    }

    @ObfuscatedName("gt.aw(IS)V")
    public void method3074(int arg0) {
        if (this.field1735) {
            if (this.field1742 == null) {
                this.field1742 = new long[arg0];
            } else {
                System.arraycopy(this.field1742, 0, this.field1742 = new long[arg0], 0, this.field1734);
            }
        }
        if (!this.field1736) {
            return;
        }
        if (this.field1758 == null) {
            this.field1758 = new String[arg0];
        } else {
            System.arraycopy(this.field1758, 0, this.field1758 = new String[arg0], 0, this.field1734);
        }
    }

    @ObfuscatedName("gt.al(Ljava/lang/String;B)I")
    public int method3143(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field1746; var2++) {
            if (this.field1757[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gt.ai(IIII)I")
    public int method3134(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field1750[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("gt.ar(II)Ljava/lang/Integer;")
    public Integer method3077(int arg0) {
        if (this.field1759 == null) {
            return null;
        } else {
            class492 var2 = this.field1759.method8299((long) arg0);
            return var2 != null && var2 instanceof class491 ? Integer.valueOf(((class491) var2).field4917) : null;
        }
    }

    @ObfuscatedName("gt.as(I)[I")
    public int[] method3078() {
        if (this.field1737 == null) {
            String[] var1 = new String[this.field1746];
            this.field1737 = new int[this.field1746];
            int var2 = 0;
            while (var2 < this.field1746) {
                var1[var2] = this.field1757[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
                this.field1737[var2] = var2++;
            }
            class529.method4203(var1, this.field1737);
        }
        return this.field1737;
    }

    @ObfuscatedName("gt.aa(JLjava/lang/String;II)V")
    public void method3115(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1735 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1736) {
            if (arg0 > 0L && (this.field1756 == null || this.field1746 >= this.field1756.length) || arg1 != null && (this.field1757 == null || this.field1746 >= this.field1757.length)) {
                this.method3073(this.field1746 + 5);
            }
            if (this.field1756 != null) {
                this.field1756[this.field1746] = arg0;
            }
            if (this.field1757 != null) {
                this.field1757[this.field1746] = arg1;
            }
            if (this.field1740 == -1) {
                this.field1740 = this.field1746;
                this.field1748[this.field1746] = 126;
            } else {
                this.field1748[this.field1746] = 0;
            }
            this.field1750[this.field1746] = 0;
            this.field1751[this.field1746] = arg2;
            this.field1752[this.field1746] = false;
            this.field1746++;
            this.field1737 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gt.az(II)V")
    public void method3080(int arg0) {
        if (arg0 < 0 || arg0 >= this.field1746) {
            throw new RuntimeException("");
        }
        this.field1746--;
        this.field1737 = null;
        if (this.field1746 == 0) {
            this.field1756 = null;
            this.field1757 = null;
            this.field1748 = null;
            this.field1750 = null;
            this.field1751 = null;
            this.field1752 = null;
            this.field1740 = -1;
            this.field1754 = -1;
            return;
        }
        System.arraycopy(this.field1748, arg0 + 1, this.field1748, arg0, this.field1746 - arg0);
        System.arraycopy(this.field1750, arg0 + 1, this.field1750, arg0, this.field1746 - arg0);
        System.arraycopy(this.field1751, arg0 + 1, this.field1751, arg0, this.field1746 - arg0);
        System.arraycopy(this.field1752, arg0 + 1, this.field1752, arg0, this.field1746 - arg0);
        if (this.field1756 != null) {
            System.arraycopy(this.field1756, arg0 + 1, this.field1756, arg0, this.field1746 - arg0);
        }
        if (this.field1757 != null) {
            System.arraycopy(this.field1757, arg0 + 1, this.field1757, arg0, this.field1746 - arg0);
        }
        this.method3081();
    }

    @ObfuscatedName("gt.ao(I)V")
    public void method3081() {
        if (this.field1746 == 0) {
            this.field1740 = -1;
            this.field1754 = -1;
            return;
        }
        this.field1740 = -1;
        this.field1754 = -1;
        int var1 = 0;
        byte var2 = this.field1748[0];
        for (int var3 = 1; var3 < this.field1746; var3++) {
            if (this.field1748[var3] > var2) {
                if (var2 == 125) {
                    this.field1754 = var1;
                }
                var1 = var3;
                var2 = this.field1748[var3];
            } else if (this.field1754 == -1 && this.field1748[var3] == 125) {
                this.field1754 = var3;
            }
        }
        this.field1740 = var1;
        if (this.field1740 != -1) {
            this.field1748[this.field1740] = 126;
        }
    }

    @ObfuscatedName("gt.au(JLjava/lang/String;I)V")
    public void method3087(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field1735 != arg0 > 0L) {
            throw new RuntimeException("");
        } else if (arg1 != null == this.field1736) {
            if (arg0 > 0L && (this.field1742 == null || this.field1734 >= this.field1742.length) || arg1 != null && (this.field1758 == null || this.field1734 >= this.field1758.length)) {
                this.method3074(this.field1734 + 5);
            }
            if (this.field1742 != null) {
                this.field1742[this.field1734] = arg0;
            }
            if (this.field1758 != null) {
                this.field1758[this.field1734] = arg1;
            }
            this.field1734++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("gt.ak(IB)V")
    public void method3083(int arg0) {
        this.field1734--;
        if (this.field1734 == 0) {
            this.field1742 = null;
            this.field1758 = null;
            return;
        }
        if (this.field1742 != null) {
            System.arraycopy(this.field1742, arg0 + 1, this.field1742, arg0, this.field1734 - arg0);
        }
        if (this.field1758 != null) {
            System.arraycopy(this.field1758, arg0 + 1, this.field1758, arg0, this.field1734 - arg0);
        }
    }

    @ObfuscatedName("gt.ah(IBS)I")
    public int method3112(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field1740 == arg0 && (this.field1754 == -1 || this.field1748[this.field1754] < 125)) {
            return -1;
        } else if (this.field1748[arg0] == arg1) {
            return -1;
        } else {
            this.field1748[arg0] = arg1;
            this.method3081();
            return arg0;
        }
    }

    @ObfuscatedName("gt.aj(II)Z")
    public boolean method3117(int arg0) {
        if (this.field1740 == arg0 || this.field1748[arg0] == 126) {
            return false;
        }
        this.field1748[this.field1740] = 125;
        this.field1754 = this.field1740;
        this.field1748[arg0] = 126;
        this.field1740 = arg0;
        return true;
    }

    @ObfuscatedName("gt.af(IZB)I")
    public int method3098(int arg0, boolean arg1) {
        if (this.field1752[arg0] == arg1) {
            return -1;
        } else {
            this.field1752[arg0] = arg1;
            return arg0;
        }
    }

    @ObfuscatedName("gt.ax(IIIII)I")
    public int method3144(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field1750[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field1750[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("gt.an(IIB)Z")
    public boolean method3088(int arg0, int arg1) {
        if (this.field1759 == null) {
            this.field1759 = new class507(4);
        } else {
            class492 var3 = this.field1759.method8299((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class491) {
                    class491 var4 = (class491) var3;
                    if (var4.field4917 == arg1) {
                        return false;
                    }
                    var4.field4917 = arg1;
                    return true;
                }
                var3.method7996();
            }
        }
        this.field1759.method8319(new class491(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gt.ag(IIIII)Z")
    public boolean method3072(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field1759 == null) {
            this.field1759 = new class507(4);
        } else {
            class492 var10 = this.field1759.method8299((long) arg0);
            if (var10 != null) {
                if (var10 instanceof class491) {
                    class491 var11 = (class491) var10;
                    if ((var11.field4917 & var7) == var9) {
                        return false;
                    }
                    var11.field4917 &= ~var7;
                    var11.field4917 |= var9;
                    return true;
                }
                var10.method7996();
            }
        }
        this.field1759.method8319(new class491(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("gt.am(IJ)Z")
    public boolean method3090(int arg0, long arg1) {
        if (this.field1759 == null) {
            this.field1759 = new class507(4);
        } else {
            class492 var4 = this.field1759.method8299((long) arg0);
            if (var4 != null) {
                if (var4 instanceof class490) {
                    class490 var5 = (class490) var4;
                    if (var5.field4916 == arg1) {
                        return false;
                    }
                    var5.field4916 = arg1;
                    return true;
                }
                var4.method7996();
            }
        }
        this.field1759.method8319(new class490(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gt.ad(ILjava/lang/String;B)Z")
    public boolean method3091(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1759 == null) {
            this.field1759 = new class507(4);
        } else {
            class492 var3 = this.field1759.method8299((long) arg0);
            if (var3 != null) {
                if (var3 instanceof class489) {
                    class489 var4 = (class489) var3;
                    if (var4.field4915 instanceof String) {
                        if (arg1.equals(var4.field4915)) {
                            return false;
                        }
                        var4.method7996();
                        this.field1759.method8319(new class489(arg1), var4.field4920);
                        return true;
                    }
                }
                var3.method7996();
            }
        }
        this.field1759.method8319(new class489(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("gt.at(Luq;B)V")
    public void method3092(class534 arg0) {
        int var2 = arg0.method8591();
        if (var2 < 1 || var2 > 6) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.method8591();
        if ((var3 & 0x1) != 0) {
            this.field1735 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field1736 = true;
        }
        if (!this.field1735) {
            this.field1756 = null;
            this.field1742 = null;
        }
        if (!this.field1736) {
            this.field1757 = null;
            this.field1758 = null;
        }
        this.field1755 = arg0.method8597();
        this.field1753 = arg0.method8597();
        if (var2 <= 3 && this.field1753 != 0) {
            this.field1753 += 16912800;
        }
        this.field1746 = arg0.method8593();
        this.field1734 = arg0.method8591();
        this.field1739 = arg0.method8741();
        if (var2 >= 4) {
            arg0.method8597();
        }
        this.field1741 = arg0.method8591() == 1;
        this.field1747 = arg0.method8592();
        this.field1749 = arg0.method8592();
        this.field1744 = arg0.method8592();
        this.field1743 = arg0.method8592();
        if (this.field1746 > 0) {
            if (this.field1735 && (this.field1756 == null || this.field1756.length < this.field1746)) {
                this.field1756 = new long[this.field1746];
            }
            if (this.field1736 && (this.field1757 == null || this.field1757.length < this.field1746)) {
                this.field1757 = new String[this.field1746];
            }
            if (this.field1748 == null || this.field1748.length < this.field1746) {
                this.field1748 = new byte[this.field1746];
            }
            if (this.field1750 == null || this.field1750.length < this.field1746) {
                this.field1750 = new int[this.field1746];
            }
            if (this.field1751 == null || this.field1751.length < this.field1746) {
                this.field1751 = new int[this.field1746];
            }
            if (this.field1752 == null || this.field1752.length < this.field1746) {
                this.field1752 = new boolean[this.field1746];
            }
            for (int var4 = 0; var4 < this.field1746; var4++) {
                if (this.field1735) {
                    this.field1756[var4] = arg0.method8598();
                }
                if (this.field1736) {
                    this.field1757[var4] = arg0.method8601();
                }
                this.field1748[var4] = arg0.method8592();
                if (var2 >= 2) {
                    this.field1750[var4] = arg0.method8597();
                }
                if (var2 >= 5) {
                    this.field1751[var4] = arg0.method8593();
                } else {
                    this.field1751[var4] = 0;
                }
                if (var2 >= 6) {
                    this.field1752[var4] = arg0.method8591() == 1;
                } else {
                    this.field1752[var4] = false;
                }
            }
            this.method3081();
        }
        if (this.field1734 > 0) {
            if (this.field1735 && (this.field1742 == null || this.field1742.length < this.field1734)) {
                this.field1742 = new long[this.field1734];
            }
            if (this.field1736 && (this.field1758 == null || this.field1758.length < this.field1734)) {
                this.field1758 = new String[this.field1734];
            }
            for (int var5 = 0; var5 < this.field1734; var5++) {
                if (this.field1735) {
                    this.field1742[var5] = arg0.method8598();
                }
                if (this.field1736) {
                    this.field1758[var5] = arg0.method8601();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.method8593();
        if (var6 <= 0) {
            return;
        }
        this.field1759 = new class507(var6 < 16 ? class320.method5477(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.method8597();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.method8597();
                this.field1759.method8319(new class491(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.method8598();
                this.field1759.method8319(new class490(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.method8741();
                this.field1759.method8319(new class489(var13), (long) var8);
            }
        }
    }
}
