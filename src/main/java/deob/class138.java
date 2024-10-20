package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("el")
public final class class138 implements Runnable {

    @ObfuscatedName("el.j")
    public InputStream field2081;

    @ObfuscatedName("el.y")
    public OutputStream field2095;

    @ObfuscatedName("el.z")
    public Socket field2089;

    @ObfuscatedName("el.l")
    public boolean field2083 = false;

    @ObfuscatedName("el.w")
    public class131 field2084;

    @ObfuscatedName("el.d")
    public class141 field2085;

    @ObfuscatedName("el.f")
    public byte[] field2086;

    @ObfuscatedName("el.i")
    public int field2080 = 0;

    @ObfuscatedName("el.a")
    public int field2088 = 0;

    @ObfuscatedName("el.o")
    public boolean field2082 = false;

    public class138(Socket arg0, class131 arg1) throws IOException {
        this.field2084 = arg1;
        this.field2089 = arg0;
        this.field2089.setSoTimeout(30000);
        this.field2089.setTcpNoDelay(true);
        this.field2081 = this.field2089.getInputStream();
        this.field2095 = this.field2089.getOutputStream();
    }

    @ObfuscatedName("el.y(I)V")
    public void method2781() {
        if (this.field2083) {
            return;
        }
        synchronized (this) {
            this.field2083 = true;
            this.notifyAll();
        }
        if (this.field2085 != null) {
            while (this.field2085.field2124 == 0) {
                class122.method558(1L);
            }
            if (this.field2085.field2124 == 1) {
                try {
                    ((Thread) this.field2085.field2118).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2085 = null;
    }

    public void finalize() {
        this.method2781();
    }

    @ObfuscatedName("el.z(S)I")
    public int method2771() throws IOException {
        return this.field2083 ? 0 : this.field2081.read();
    }

    @ObfuscatedName("el.l(I)I")
    public int method2776() throws IOException {
        return this.field2083 ? 0 : this.field2081.available();
    }

    @ObfuscatedName("el.w([BIII)V")
    public void method2773(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2083) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2081.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("el.d([BIII)V")
    public void method2779(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2083) {
            return;
        }
        if (this.field2082) {
            this.field2082 = false;
            throw new IOException();
        }
        if (this.field2086 == null) {
            this.field2086 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2086[this.field2088] = arg0[arg1 + var5];
                this.field2088 = (this.field2088 + 1) % 5000;
                if ((this.field2080 + 4900) % 5000 == this.field2088) {
                    throw new IOException();
                }
            }
            if (this.field2085 == null) {
                this.field2085 = this.field2084.method2697(this, 3);
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
                        if (this.field2088 == this.field2080) {
                            if (this.field2083) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2080;
                        if (this.field2088 >= this.field2080) {
                            var4 = this.field2088 - this.field2080;
                        } else {
                            var4 = 5000 - this.field2080;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2095.write(this.field2086, var3, var4);
                    } catch (IOException var12) {
                        this.field2082 = true;
                    }
                    this.field2080 = (this.field2080 + var4) % 5000;
                    try {
                        if (this.field2088 == this.field2080) {
                            this.field2095.flush();
                        }
                    } catch (IOException var11) {
                        this.field2082 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2081 != null) {
                        this.field2081.close();
                    }
                    if (this.field2095 != null) {
                        this.field2095.close();
                    }
                    if (this.field2089 != null) {
                        this.field2089.close();
                    }
                } catch (IOException var10) {
                }
                this.field2086 = null;
                break;
            }
        } catch (Exception var15) {
            class143.method1973((String) null, var15);
        }
    }
}
