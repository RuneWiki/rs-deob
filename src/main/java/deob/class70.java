package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bp")
public final class class70 implements Runnable {

    @ObfuscatedName("bp.p")
    public InputStream field1296;

    @ObfuscatedName("bp.e")
    public OutputStream field1297;

    @ObfuscatedName("bp.a")
    public Socket field1290;

    @ObfuscatedName("bp.h")
    public boolean field1291 = false;

    @ObfuscatedName("bp.y")
    public class74 field1288;

    @ObfuscatedName("bp.j")
    public class79 field1293;

    @ObfuscatedName("bp.l")
    public byte[] field1289;

    @ObfuscatedName("bp.f")
    public int field1294 = 0;

    @ObfuscatedName("bp.n")
    public int field1302 = 0;

    @ObfuscatedName("bp.k")
    public boolean field1295 = false;

    public class70(Socket arg0, class74 arg1) throws IOException {
        this.field1288 = arg1;
        this.field1290 = arg0;
        this.field1290.setSoTimeout(30000);
        this.field1290.setTcpNoDelay(true);
        this.field1296 = this.field1290.getInputStream();
        this.field1297 = this.field1290.getOutputStream();
    }

    @ObfuscatedName("bp.h(I)V")
    public void method1414() {
        if (this.field1291) {
            return;
        }
        synchronized (this) {
            this.field1291 = true;
            this.notifyAll();
        }
        if (this.field1293 != null) {
            while (this.field1293.field1415 == 0) {
                class126.method47(1L);
            }
            if (this.field1293.field1415 == 1) {
                try {
                    ((Thread) this.field1293.field1418).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1293 = null;
    }

    public void finalize() {
        this.method1414();
    }

    @ObfuscatedName("bp.y(I)I")
    public int method1405() throws IOException {
        return this.field1291 ? 0 : this.field1296.read();
    }

    @ObfuscatedName("bp.j(I)I")
    public int method1406() throws IOException {
        return this.field1291 ? 0 : this.field1296.available();
    }

    @ObfuscatedName("bp.l([BIII)V")
    public void method1411(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1291) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1296.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("bp.f([BIIB)V")
    public void method1408(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1291) {
            return;
        }
        if (this.field1295) {
            this.field1295 = false;
            throw new IOException();
        }
        if (this.field1289 == null) {
            this.field1289 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1289[this.field1302] = arg0[arg1 + var5];
                this.field1302 = (this.field1302 + 1) % 5000;
                if ((this.field1294 + 4900) % 5000 == this.field1302) {
                    throw new IOException();
                }
            }
            if (this.field1293 == null) {
                this.field1293 = this.field1288.method1517(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1302 == this.field1294) {
                            if (this.field1291) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1294;
                        if (this.field1302 >= this.field1294) {
                            var4 = this.field1302 - this.field1294;
                        } else {
                            var4 = 5000 - this.field1294;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1297.write(this.field1289, var3, var4);
                    } catch (IOException var12) {
                        this.field1295 = true;
                    }
                    this.field1294 = (this.field1294 + var4) % 5000;
                    try {
                        if (this.field1302 == this.field1294) {
                            this.field1297.flush();
                        }
                    } catch (IOException var11) {
                        this.field1295 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1296 != null) {
                        this.field1296.close();
                    }
                    if (this.field1297 != null) {
                        this.field1297.close();
                    }
                    if (this.field1290 != null) {
                        this.field1290.close();
                    }
                } catch (IOException var10) {
                }
                this.field1289 = null;
                break;
            }
        } catch (Exception var15) {
            class80.method838((String) null, var15);
        }
    }
}
