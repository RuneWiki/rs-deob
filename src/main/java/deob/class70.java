package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("be")
public class class70 extends class57 {

    @ObfuscatedName("be.w")
    public AudioFormat field1290;

    @ObfuscatedName("be.x")
    public SourceDataLine field1292;

    @ObfuscatedName("be.af")
    public int field1291;

    @ObfuscatedName("be.ai")
    public byte[] field1293;

    @ObfuscatedName("be.w(Ljava/awt/Component;)V")
    public void method1130(Component arg0) {
        this.field1290 = new AudioFormat((float) Statics.field2059, 16, Statics.field1195 ? 2 : 1, true, false);
        this.field1293 = new byte[0x100 << (Statics.field1195 ? 2 : 1)];
    }

    @ObfuscatedName("be.x(I)V")
    public void method1114(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1290, arg0 << (Statics.field1195 ? 2 : 1));
            this.field1292 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1292.open();
            this.field1292.start();
            this.field1291 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1292 = null;
                throw var11;
            } else {
                this.method1114(class127.method2662(arg0));
            }
        }
    }

    @ObfuscatedName("be.t()I")
    public int method1115() {
        return this.field1291 - (this.field1292.available() >> (Statics.field1195 ? 2 : 1));
    }

    @ObfuscatedName("be.p()V")
    public void method1128() {
        int var1 = 256;
        if (Statics.field1195) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1194[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1293[var2 * 2] = (byte) (var3 >> 8);
            this.field1293[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1292.write(this.field1293, 0, var1 << 1);
    }

    @ObfuscatedName("be.e()V")
    public void method1117() {
        if (this.field1292 != null) {
            this.field1292.close();
            this.field1292 = null;
        }
    }

    @ObfuscatedName("be.y()V")
    public void method1119() {
        this.field1292.flush();
    }
}
