package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("l")
public class class23 {

    @ObfuscatedName("l.j")
    public int field370;

    @ObfuscatedName("l.y")
    public class78 field354;

    @ObfuscatedName("l.x")
    public DataInputStream field356;

    @ObfuscatedName("l.z")
    public byte[] field365 = new byte[4];

    @ObfuscatedName("l.c")
    public int field358;

    @ObfuscatedName("l.e")
    public byte[] field359;

    @ObfuscatedName("l.s")
    public int field369;

    @ObfuscatedName("l.i")
    public long field361;

    public class23(class73 arg0, URL arg1) {
        this.field354 = arg0.method1477(arg1);
        this.field370 = 0;
        this.field361 = class120.method2616() + 30000L;
    }

    @ObfuscatedName("l.j(I)[B")
    public byte[] method216() throws IOException {
        if (class120.method2616() > this.field361) {
            throw new IOException();
        }
        if (this.field370 == 0) {
            if (this.field354.field1399 == 2) {
                throw new IOException();
            }
            if (this.field354.field1399 == 1) {
                this.field356 = (DataInputStream) this.field354.field1398;
                this.field370 = 1;
            }
        }
        if (this.field370 == 1) {
            int var1 = this.field356.available();
            if (var1 > 0) {
                if (this.field358 + var1 > 4) {
                    var1 = 4 - this.field358;
                }
                this.field358 += this.field356.read(this.field365, this.field358, var1);
                if (this.field358 == 4) {
                    int var2 = (new class126(this.field365)).method2387();
                    this.field359 = new byte[var2];
                    this.field370 = 2;
                }
            }
        }
        if (this.field370 == 2) {
            int var3 = this.field356.available();
            if (var3 > 0) {
                if (this.field369 + var3 > this.field359.length) {
                    var3 = this.field359.length - this.field369;
                }
                this.field369 += this.field356.read(this.field359, this.field369, var3);
                if (this.field369 == this.field359.length) {
                    return this.field359;
                }
            }
        }
        return null;
    }
}
