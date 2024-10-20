package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("z")
public class class19 {

    @ObfuscatedName("z.e")
    public int field268;

    @ObfuscatedName("z.l")
    public class150 field263;

    @ObfuscatedName("z.c")
    public DataInputStream field262;

    @ObfuscatedName("z.h")
    public byte[] field267 = new byte[4];

    @ObfuscatedName("z.r")
    public int field266;

    @ObfuscatedName("z.a")
    public byte[] field264;

    @ObfuscatedName("z.b")
    public int field271;

    @ObfuscatedName("z.u")
    public long field269;

    public class19(class140 arg0, URL arg1) {
        this.field263 = arg0.method2844(arg1);
        this.field268 = 0;
        this.field269 = class119.method415() + 30000L;
    }

    @ObfuscatedName("z.e(I)[B")
    public byte[] method161() throws IOException {
        if (class119.method415() > this.field269) {
            throw new IOException();
        }
        if (this.field268 == 0) {
            if (this.field263.field2265 == 2) {
                throw new IOException();
            }
            if (this.field263.field2265 == 1) {
                this.field262 = (DataInputStream) this.field263.field2261;
                this.field268 = 1;
            }
        }
        if (this.field268 == 1) {
            int var1 = this.field262.available();
            if (var1 > 0) {
                if (this.field266 + var1 > 4) {
                    var1 = 4 - this.field266;
                }
                this.field266 += this.field262.read(this.field267, this.field266, var1);
                if (this.field266 == 4) {
                    int var2 = (new class123(this.field267)).method2468();
                    this.field264 = new byte[var2];
                    this.field268 = 2;
                }
            }
        }
        if (this.field268 == 2) {
            int var3 = this.field262.available();
            if (var3 > 0) {
                if (this.field271 + var3 > this.field264.length) {
                    var3 = this.field264.length - this.field271;
                }
                this.field271 += this.field262.read(this.field264, this.field271, var3);
                if (this.field271 == this.field264.length) {
                    return this.field264;
                }
            }
        }
        return null;
    }
}
