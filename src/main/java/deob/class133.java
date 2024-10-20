package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ea")
public final class class133 extends class330 implements Runnable {

    @ObfuscatedName("ea.f")
    public InputStream field1509;

    @ObfuscatedName("ea.e")
    public OutputStream field1507;

    @ObfuscatedName("ea.v")
    public Socket field1508;

    @ObfuscatedName("ea.y")
    public boolean field1513 = false;

    @ObfuscatedName("ea.j")
    public class129 field1511;

    @ObfuscatedName("ea.o")
    public class135 field1512;

    @ObfuscatedName("ea.m")
    public byte[] field1510;

    @ObfuscatedName("ea.r")
    public int field1516 = 0;

    @ObfuscatedName("ea.h")
    public int field1514 = 0;

    @ObfuscatedName("ea.d")
    public boolean field1515 = false;

    @ObfuscatedName("ea.z")
    public final int field1506;

    @ObfuscatedName("ea.b")
    public final int field1517;

    public class133(Socket arg0, class129 arg1, int arg2) throws IOException {
        this.field1511 = arg1;
        this.field1508 = arg0;
        this.field1506 = arg2;
        this.field1517 = arg2 - 100;
        this.field1508.setSoTimeout(30000);
        this.field1508.setTcpNoDelay(true);
        this.field1508.setReceiveBufferSize(65536);
        this.field1508.setSendBufferSize(65536);
        this.field1509 = this.field1508.getInputStream();
        this.field1507 = this.field1508.getOutputStream();
    }

    @ObfuscatedName("ea.f(I)V")
    public void method2364() {
        if (this.field1513) {
            return;
        }
        synchronized (this) {
            this.field1513 = true;
            this.notifyAll();
        }
        if (this.field1512 != null) {
            while (this.field1512.field1533 == 0) {
                class382.method169(1L);
            }
            if (this.field1512.field1533 == 1) {
                try {
                    ((Thread) this.field1512.field1532).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1512 = null;
    }

    public void finalize() {
        this.method2364();
    }

    @ObfuscatedName("ea.e(I)I")
    public int method2363() throws IOException {
        return this.field1513 ? 0 : this.field1509.read();
    }

    @ObfuscatedName("ea.v(I)I")
    public int method2366() throws IOException {
        return this.field1513 ? 0 : this.field1509.available();
    }

    @ObfuscatedName("ea.y(II)Z")
    public boolean method2384(int arg0) throws IOException {
        if (this.field1513) {
            return false;
        } else {
            return this.field1509.available() >= arg0;
        }
    }

    @ObfuscatedName("ea.j([BIII)I")
    public int method2368(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1513) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1509.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ea.o([BIIB)V")
    public void method2382(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1513) {
            return;
        }
        if (this.field1515) {
            this.field1515 = false;
            throw new IOException();
        }
        if (this.field1510 == null) {
            this.field1510 = new byte[this.field1506];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1510[this.field1514] = arg0[arg1 + var5];
                this.field1514 = (this.field1514 + 1) % this.field1506;
                if ((this.field1517 + this.field1516) % this.field1506 == this.field1514) {
                    throw new IOException();
                }
            }
            if (this.field1512 == null) {
                this.field1512 = this.field1511.method2330(this, 3);
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
                        if (this.field1516 == this.field1514) {
                            if (this.field1513) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1516;
                        if (this.field1514 >= this.field1516) {
                            var4 = this.field1514 - this.field1516;
                        } else {
                            var4 = this.field1506 - this.field1516;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1507.write(this.field1510, var3, var4);
                    } catch (IOException var12) {
                        this.field1515 = true;
                    }
                    this.field1516 = (this.field1516 + var4) % this.field1506;
                    try {
                        if (this.field1516 == this.field1514) {
                            this.field1507.flush();
                        }
                    } catch (IOException var11) {
                        this.field1515 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1509 != null) {
                        this.field1509.close();
                    }
                    if (this.field1507 != null) {
                        this.field1507.close();
                    }
                    if (this.field1508 != null) {
                        this.field1508.close();
                    }
                } catch (IOException var10) {
                }
                this.field1510 = null;
                break;
            }
        } catch (Exception var15) {
            class407.method5131((String) null, var15);
        }
    }

    @ObfuscatedName("ea.m([BIII)V")
    public void method2370(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2382(arg0, arg1, arg2);
    }
}
