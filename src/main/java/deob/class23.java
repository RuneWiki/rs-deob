package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("k")
public class class23 {

    @ObfuscatedName("k.c")
    public int field369;

    @ObfuscatedName("k.j")
    public class78 field380;

    @ObfuscatedName("k.f")
    public DataInputStream field370;

    @ObfuscatedName("k.y")
    public byte[] field371 = new byte[4];

    @ObfuscatedName("k.x")
    public int field372;

    @ObfuscatedName("k.e")
    public byte[] field375;

    @ObfuscatedName("k.m")
    public int field368;

    @ObfuscatedName("k.s")
    public long field374;

    public class23(class73 arg0, URL arg1) {
        this.field380 = arg0.method1434(arg1);
        this.field369 = 0;
        this.field374 = class120.method774() + 30000L;
    }

    @ObfuscatedName("k.c(I)[B")
    public byte[] method214() throws IOException {
        if (class120.method774() > this.field374) {
            throw new IOException();
        }
        if (this.field369 == 0) {
            if (this.field380.field1385 == 2) {
                throw new IOException();
            }
            if (this.field380.field1385 == 1) {
                this.field370 = (DataInputStream) this.field380.field1384;
                this.field369 = 1;
            }
        }
        if (this.field369 == 1) {
            int var1 = this.field370.available();
            if (var1 > 0) {
                if (this.field372 + var1 > 4) {
                    var1 = 4 - this.field372;
                }
                this.field372 += this.field370.read(this.field371, this.field372, var1);
                if (this.field372 == 4) {
                    int var2 = (new class125(this.field371)).method2489();
                    this.field375 = new byte[var2];
                    this.field369 = 2;
                }
            }
        }
        if (this.field369 == 2) {
            int var3 = this.field370.available();
            if (var3 > 0) {
                if (this.field368 + var3 > this.field375.length) {
                    var3 = this.field375.length - this.field368;
                }
                this.field368 += this.field370.read(this.field375, this.field368, var3);
                if (this.field368 == this.field375.length) {
                    return this.field375;
                }
            }
        }
        return null;
    }
}
