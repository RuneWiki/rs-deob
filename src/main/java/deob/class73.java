package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class73 extends class60 {

    @ObfuscatedName("ba.as")
    public AudioFormat field1358;

    @ObfuscatedName("ba.af")
    public SourceDataLine field1357;

    @ObfuscatedName("ba.am")
    public int field1359;

    @ObfuscatedName("ba.ap")
    public byte[] field1356;

    @ObfuscatedName("ba.x(Ljava/awt/Component;I)V")
    public void method1220(Component arg0) {
        this.field1358 = new AudioFormat((float) Statics.field1266, 16, Statics.field1263 ? 2 : 1, true, false);
        this.field1356 = new byte[0x100 << (Statics.field1263 ? 2 : 1)];
    }

    @ObfuscatedName("ba.u(IB)V")
    public void method1239(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1358, arg0 << (Statics.field1263 ? 2 : 1));
            this.field1357 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1357.open();
            this.field1357.start();
            this.field1359 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1357 = null;
                throw var11;
            } else {
                this.method1239(class130.method3006(arg0));
            }
        }
    }

    @ObfuscatedName("ba.j(S)I")
    public int method1226() {
        return this.field1359 - (this.field1357.available() >> (Statics.field1263 ? 2 : 1));
    }

    @ObfuscatedName("ba.q()V")
    public void method1223() {
        int var1 = 256;
        if (Statics.field1263) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1252[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1356[var2 * 2] = (byte) (var3 >> 8);
            this.field1356[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1357.write(this.field1356, 0, var1 << 1);
    }

    @ObfuscatedName("ba.w(I)V")
    public void method1224() {
        if (this.field1357 != null) {
            this.field1357.close();
            this.field1357 = null;
        }
    }

    @ObfuscatedName("ba.b(I)V")
    public void method1225() {
        this.field1357.flush();
    }
}
