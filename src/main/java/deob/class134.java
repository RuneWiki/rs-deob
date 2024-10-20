package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ev")
public final class class134 implements Runnable {

    @ObfuscatedName("ev.b")
    public InputStream field2062;

    @ObfuscatedName("ev.e")
    public OutputStream field2058;

    @ObfuscatedName("ev.i")
    public Socket field2053;

    @ObfuscatedName("ev.k")
    public boolean field2055 = false;

    @ObfuscatedName("ev.h")
    public class127 field2056;

    @ObfuscatedName("ev.p")
    public class137 field2057;

    @ObfuscatedName("ev.n")
    public byte[] field2052;

    @ObfuscatedName("ev.o")
    public int field2059 = 0;

    @ObfuscatedName("ev.g")
    public int field2060 = 0;

    @ObfuscatedName("ev.z")
    public boolean field2061 = false;

    public class134(Socket arg0, class127 arg1) throws IOException {
        this.field2056 = arg1;
        this.field2053 = arg0;
        this.field2053.setSoTimeout(30000);
        this.field2053.setTcpNoDelay(true);
        this.field2062 = this.field2053.getInputStream();
        this.field2058 = this.field2053.getOutputStream();
    }

    @ObfuscatedName("ev.e(I)V")
    public void method2608() {
        if (this.field2055) {
            return;
        }
        synchronized (this) {
            this.field2055 = true;
            this.notifyAll();
        }
        if (this.field2057 != null) {
            while (this.field2057.field2088 == 0) {
                class118.method2490(1L);
            }
            if (this.field2057.field2088 == 1) {
                try {
                    ((Thread) this.field2057.field2089).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2057 = null;
    }

    public void finalize() {
        this.method2608();
    }

    @ObfuscatedName("ev.i(B)I")
    public int method2612() throws IOException {
        return this.field2055 ? 0 : this.field2062.read();
    }

    @ObfuscatedName("ev.k(B)I")
    public int method2611() throws IOException {
        return this.field2055 ? 0 : this.field2062.available();
    }

    @ObfuscatedName("ev.h([BIII)V")
    public void method2619(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2055) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2062.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ev.p([BIII)V")
    public void method2613(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2055) {
            return;
        }
        if (this.field2061) {
            this.field2061 = false;
            throw new IOException();
        }
        if (this.field2052 == null) {
            this.field2052 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2052[this.field2060] = arg0[arg1 + var5];
                this.field2060 = (this.field2060 + 1) % 5000;
                if ((this.field2059 + 4900) % 5000 == this.field2060) {
                    throw new IOException();
                }
            }
            if (this.field2057 == null) {
                this.field2057 = this.field2056.method2496(this, 3);
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
                        if (this.field2060 == this.field2059) {
                            if (this.field2055) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2059;
                        if (this.field2060 >= this.field2059) {
                            var4 = this.field2060 - this.field2059;
                        } else {
                            var4 = 5000 - this.field2059;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2058.write(this.field2052, var3, var4);
                    } catch (IOException var12) {
                        this.field2061 = true;
                    }
                    this.field2059 = (this.field2059 + var4) % 5000;
                    try {
                        if (this.field2060 == this.field2059) {
                            this.field2058.flush();
                        }
                    } catch (IOException var11) {
                        this.field2061 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2062 != null) {
                        this.field2062.close();
                    }
                    if (this.field2058 != null) {
                        this.field2058.close();
                    }
                    if (this.field2053 != null) {
                        this.field2053.close();
                    }
                } catch (IOException var10) {
                }
                this.field2052 = null;
                break;
            }
        } catch (Exception var15) {
            class139.method1404((String) null, var15);
        }
    }
}
