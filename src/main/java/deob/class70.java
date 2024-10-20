package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bz")
public class class70 extends class57 {

    @ObfuscatedName("bz.h")
    public AudioFormat field1296;

    @ObfuscatedName("bz.m")
    public SourceDataLine field1295;

    @ObfuscatedName("bz.af")
    public int field1297;

    @ObfuscatedName("bz.ax")
    public byte[] field1294;

    @ObfuscatedName("bz.h(Ljava/awt/Component;)V")
    public void method1071(Component arg0) {
        this.field1296 = new AudioFormat((float) Statics.field1199, 16, Statics.field1185 ? 2 : 1, true, false);
        this.field1294 = new byte[0x100 << (Statics.field1185 ? 2 : 1)];
    }

    @ObfuscatedName("bz.m(I)V")
    public void method1072(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1296, arg0 << (Statics.field1185 ? 2 : 1));
            this.field1295 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1295.open();
            this.field1295.start();
            this.field1297 = arg0;
        } catch (LineUnavailableException var11) {
            if (class126.method923(arg0) == 1) {
                this.field1295 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1072(var10);
        }
    }

    @ObfuscatedName("bz.i()I")
    public int method1073() {
        return this.field1297 - (this.field1295.available() >> (Statics.field1185 ? 2 : 1));
    }

    @ObfuscatedName("bz.q()V")
    public void method1074() {
        int var1 = 256;
        if (Statics.field1185) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1189[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1294[var2 * 2] = (byte) (var3 >> 8);
            this.field1294[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1295.write(this.field1294, 0, var1 << 1);
    }

    @ObfuscatedName("bz.p()V")
    public void method1084() {
        if (this.field1295 != null) {
            this.field1295.close();
            this.field1295 = null;
        }
    }

    @ObfuscatedName("bz.c()V")
    public void method1076() {
        this.field1295.flush();
    }
}
