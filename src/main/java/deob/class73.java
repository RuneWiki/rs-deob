package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bo")
public class class73 extends class60 {

    @ObfuscatedName("bo.as")
    public AudioFormat field1341;

    @ObfuscatedName("bo.ad")
    public SourceDataLine field1338;

    @ObfuscatedName("bo.af")
    public int field1340;

    @ObfuscatedName("bo.ak")
    public byte[] field1339;

    @ObfuscatedName("bo.y(Ljava/awt/Component;B)V")
    public void method1189(Component arg0) {
        this.field1341 = new AudioFormat((float) Statics.field1240, 16, Statics.field3222 ? 2 : 1, true, false);
        this.field1339 = new byte[0x100 << (Statics.field3222 ? 2 : 1)];
    }

    @ObfuscatedName("bo.s(II)V")
    public void method1190(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1341, arg0 << (Statics.field3222 ? 2 : 1));
            this.field1338 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1338.open();
            this.field1338.start();
            this.field1340 = arg0;
        } catch (LineUnavailableException var11) {
            if (class130.method2343(arg0) == 1) {
                this.field1338 = null;
                throw var11;
            }
            int var4 = arg0 - 1;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            int var10 = var9 + 1;
            this.method1190(var10);
        }
    }

    @ObfuscatedName("bo.p(I)I")
    public int method1191() {
        return this.field1340 - (this.field1338.available() >> (Statics.field3222 ? 2 : 1));
    }

    @ObfuscatedName("bo.v()V")
    public void method1192() {
        int var1 = 256;
        if (Statics.field3222) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1235[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1339[var2 * 2] = (byte) (var3 >> 8);
            this.field1339[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1338.write(this.field1339, 0, var1 << 1);
    }

    @ObfuscatedName("bo.r(I)V")
    public void method1193() {
        if (this.field1338 != null) {
            this.field1338.close();
            this.field1338 = null;
        }
    }

    @ObfuscatedName("bo.c(I)V")
    public void method1194() {
        this.field1338.flush();
    }
}
