package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bv")
public class class73 extends class60 {

    @ObfuscatedName("bv.an")
    public AudioFormat field1359;

    @ObfuscatedName("bv.ap")
    public SourceDataLine field1358;

    @ObfuscatedName("bv.ar")
    public int field1360;

    @ObfuscatedName("bv.ab")
    public byte[] field1361;

    @ObfuscatedName("bv.v(Ljava/awt/Component;I)V")
    public void method1223(Component arg0) {
        this.field1359 = new AudioFormat((float) Statics.field1269, 16, Statics.field1248 ? 2 : 1, true, false);
        this.field1361 = new byte[0x100 << (Statics.field1248 ? 2 : 1)];
    }

    @ObfuscatedName("bv.h(II)V")
    public void method1250(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1359, arg0 << (Statics.field1248 ? 2 : 1));
            this.field1358 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1358.open();
            this.field1358.start();
            this.field1360 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1358 = null;
                throw var11;
            } else {
                this.method1250(class130.method721(arg0));
            }
        }
    }

    @ObfuscatedName("bv.u(I)I")
    public int method1225() {
        return this.field1360 - (this.field1358.available() >> (Statics.field1248 ? 2 : 1));
    }

    @ObfuscatedName("bv.y()V")
    public void method1226() {
        int var1 = 256;
        if (Statics.field1248) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1252[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1361[var2 * 2] = (byte) (var3 >> 8);
            this.field1361[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1358.write(this.field1361, 0, var1 << 1);
    }

    @ObfuscatedName("bv.p(I)V")
    public void method1264() {
        if (this.field1358 != null) {
            this.field1358.close();
            this.field1358 = null;
        }
    }

    @ObfuscatedName("bv.s(B)V")
    public void method1224() {
        this.field1358.flush();
    }
}
