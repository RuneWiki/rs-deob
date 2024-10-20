package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("go")
public class class168 extends class504 {

    @ObfuscatedName("go.ak")
    public boolean field1825;

    @ObfuscatedName("go.al")
    public boolean field1824 = true;

    @ObfuscatedName("go.aj")
    public List field1831;

    @ObfuscatedName("go.az")
    public int[] field1826;

    @ObfuscatedName("go.af")
    public long field1827;

    @ObfuscatedName("go.aa")
    public String field1828 = null;

    @ObfuscatedName("go.at")
    public byte field1829;

    @ObfuscatedName("go.ab")
    public byte field1830;

    static {
        new BitSet(65536);
    }

    public class168(class546 arg0) {
        this.method3199(arg0);
    }

    @ObfuscatedName("go.ak(I)[I")
    public int[] method3195() {
        if (this.field1826 == null) {
            String[] var1 = new String[this.field1831.size()];
            this.field1826 = new int[this.field1831.size()];
            int var2 = 0;
            while (var2 < this.field1831.size()) {
                var1[var2] = ((class150) this.field1831.get(var2)).field1698.method9386();
                this.field1826[var2] = var2++;
            }
            class541.method2117(var1, this.field1826);
        }
        return this.field1826;
    }

    @ObfuscatedName("go.al(Lfj;B)V")
    public void method3196(class150 arg0) {
        this.field1831.add(arg0);
        this.field1826 = null;
    }

    @ObfuscatedName("go.aj(IB)V")
    public void method3211(int arg0) {
        this.field1831.remove(arg0);
        this.field1826 = null;
    }

    @ObfuscatedName("go.az(B)I")
    public int method3198() {
        return this.field1831.size();
    }

    @ObfuscatedName("go.af(Ljava/lang/String;B)I")
    public int method3201(String arg0) {
        if (!this.field1824) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1831.size(); var2++) {
            if (((class150) this.field1831.get(var2)).field1698.method9385().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("go.aa(Lua;I)V")
    public void method3199(class546 arg0) {
        int var2 = arg0.method8796();
        if ((var2 & 0x1) != 0) {
            this.field1825 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1824 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8796();
        }
        this.field5049 = arg0.method8802();
        this.field1827 = arg0.method8802();
        this.field1828 = arg0.method8806();
        arg0.method8804();
        this.field1830 = arg0.method8797();
        this.field1829 = arg0.method8797();
        int var4 = arg0.method8798();
        if (var4 <= 0) {
            return;
        }
        this.field1831 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class150 var6 = new class150();
            if (this.field1825) {
                arg0.method8802();
            }
            if (this.field1824) {
                var6.field1698 = new class568(arg0.method8806());
            }
            var6.field1699 = arg0.method8797();
            var6.field1704 = arg0.method8798();
            if (var3 >= 3) {
                arg0.method8804();
            }
            this.field1831.add(var5, var6);
        }
    }
}
