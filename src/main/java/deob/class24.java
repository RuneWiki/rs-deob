package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class24 {

    @ObfuscatedName("x.i")
    public byte[] field389 = new byte[4];

    @ObfuscatedName("x.p")
    public int field383;

    @ObfuscatedName("x.a")
    public class79 field381;

    @ObfuscatedName("x.l")
    public DataInputStream field382;

    @ObfuscatedName("x.q")
    public int field384;

    @ObfuscatedName("x.b")
    public byte[] field380;

    @ObfuscatedName("x.u")
    public int field391;

    @ObfuscatedName("x.d")
    public long field386;

    public class24(class74 arg0, URL arg1) {
        this.field381 = arg0.method1436(arg1);
        this.field383 = 0;
        this.field386 = class121.method2124() + 30000L;
    }

    @ObfuscatedName("x.i(B)[B")
    public byte[] method240() throws IOException {
        if (class121.method2124() > this.field386) {
            throw new IOException();
        }
        if (this.field383 == 0) {
            if (this.field381.field1428 == 2) {
                throw new IOException();
            }
            if (this.field381.field1428 == 1) {
                this.field382 = (DataInputStream) this.field381.field1432;
                this.field383 = 1;
            }
        }
        if (this.field383 == 1) {
            int var1 = this.field382.available();
            if (var1 > 0) {
                if (this.field384 + var1 > 4) {
                    var1 = 4 - this.field384;
                }
                this.field384 += this.field382.read(this.field389, this.field384, var1);
                if (this.field384 == 4) {
                    int var2 = (new class127(this.field389)).method2416();
                    this.field380 = new byte[var2];
                    this.field383 = 2;
                }
            }
        }
        if (this.field383 == 2) {
            int var3 = this.field382.available();
            if (var3 > 0) {
                if (this.field391 + var3 > this.field380.length) {
                    var3 = this.field380.length - this.field391;
                }
                this.field391 += this.field382.read(this.field380, this.field391, var3);
                if (this.field391 == this.field380.length) {
                    return this.field380;
                }
            }
        }
        return null;
    }
}
