package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("as")
public class class45 extends class33 {

    @ObfuscatedName("as.b")
    public HashSet field572;

    @ObfuscatedName("as.x")
    public HashSet field579;

    @ObfuscatedName("as.o")
    public List field573;

    @ObfuscatedName("as.cd(Lfv;Lfv;Lfv;IZI)V")
    public void method569(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method240(arg0, arg3);
        int var6 = arg2.method2932();
        this.field572 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method152(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field572.add(var8);
        }
        int var10 = arg2.method2932();
        this.field579 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method581(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field579.add(var12);
        }
        this.method570(arg1, arg4);
    }

    @ObfuscatedName("as.cp(Lfv;ZB)V")
    public void method570(class174 arg0, boolean arg1) {
        this.field573 = new LinkedList();
        int var3 = arg0.method2932();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2945();
            class213 var6 = new class213(arg0.method2927());
            boolean var7 = arg0.method2930() == 1;
            if (arg1 || !var7) {
                this.field573.add(new class26(var5, var6));
            }
        }
    }
}
