package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gg")
public class class166 extends class492 {

    @ObfuscatedName("gg.aq")
    public boolean field1806;

    @ObfuscatedName("gg.aw")
    public boolean field1803 = true;

    @ObfuscatedName("gg.al")
    public List field1804;

    @ObfuscatedName("gg.ai")
    public int[] field1805;

    @ObfuscatedName("gg.ar")
    public long field1809;

    @ObfuscatedName("gg.as")
    public String field1808 = null;

    @ObfuscatedName("gg.aa")
    public byte field1807;

    @ObfuscatedName("gg.az")
    public byte field1802;

    static {
        new BitSet(65536);
    }

    public class166(class534 arg0) {
        this.method3174(arg0);
    }

    @ObfuscatedName("gg.aq(I)[I")
    public int[] method3169() {
        if (this.field1805 == null) {
            String[] var1 = new String[this.field1804.size()];
            this.field1805 = new int[this.field1804.size()];
            int var2 = 0;
            while (var2 < this.field1804.size()) {
                var1[var2] = ((class148) this.field1804.get(var2)).field1679.method9180();
                this.field1805[var2] = var2++;
            }
            class529.method4203(var1, this.field1805);
        }
        return this.field1805;
    }

    @ObfuscatedName("gg.aw(Lfe;I)V")
    public void method3170(class148 arg0) {
        this.field1804.add(arg0);
        this.field1805 = null;
    }

    @ObfuscatedName("gg.al(II)V")
    public void method3171(int arg0) {
        this.field1804.remove(arg0);
        this.field1805 = null;
    }

    @ObfuscatedName("gg.ai(B)I")
    public int method3180() {
        return this.field1804.size();
    }

    @ObfuscatedName("gg.ar(Ljava/lang/String;I)I")
    public int method3186(String arg0) {
        if (!this.field1803) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1804.size(); var2++) {
            if (((class148) this.field1804.get(var2)).field1679.method9185().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gg.as(Luq;I)V")
    public void method3174(class534 arg0) {
        int var2 = arg0.method8591();
        if ((var2 & 0x1) != 0) {
            this.field1806 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1803 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8591();
        }
        this.field4920 = arg0.method8598();
        this.field1809 = arg0.method8598();
        this.field1808 = arg0.method8741();
        arg0.method8600();
        this.field1802 = arg0.method8592();
        this.field1807 = arg0.method8592();
        int var4 = arg0.method8593();
        if (var4 <= 0) {
            return;
        }
        this.field1804 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class148 var6 = new class148();
            if (this.field1806) {
                arg0.method8598();
            }
            if (this.field1803) {
                var6.field1679 = new class557(arg0.method8741());
            }
            var6.field1680 = arg0.method8592();
            var6.field1681 = arg0.method8593();
            if (var3 >= 3) {
                arg0.method8600();
            }
            this.field1804.add(var5, var6);
        }
    }
}
