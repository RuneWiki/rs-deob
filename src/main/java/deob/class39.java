package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ay")
public class class39 extends class27 {

    @ObfuscatedName("ay.v")
    public HashSet field322;

    @ObfuscatedName("ay.k")
    public HashSet field325;

    @ObfuscatedName("ay.s")
    public List field324;

    @ObfuscatedName("ay.cd(Lkq;Lkq;IZI)V")
    public void method569(class300 arg0, class300 arg1, int arg2, boolean arg3) {
        this.method340(arg0, arg2);
        int var5 = arg1.method5112();
        this.field322 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method158(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field322.add(var7);
        }
        int var9 = arg1.method5112();
        this.field325 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method579(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field325.add(var11);
        }
        this.method570(arg1, arg3);
    }

    @ObfuscatedName("ay.cj(Lkq;ZB)V")
    public void method570(class300 arg0, boolean arg1) {
        this.field324 = new LinkedList();
        int var3 = arg0.method5112();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5127();
            class214 var6 = new class214(arg0.method5192());
            boolean var7 = arg0.method5110() == 1;
            if (arg1 || !var7) {
                this.field324.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
