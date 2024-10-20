package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hp")
public class class185 {

    @ObfuscatedName("hp.ah")
    public Map field1950 = new HashMap();

    @ObfuscatedName("hp.af")
    public int field1948 = 0;

    @ObfuscatedName("hp.at")
    public static final class185 field1951 = new class185();

    @ObfuscatedName("pb.az(B)Lhp;")
    public static class185 method6544() {
        return field1951;
    }

    @ObfuscatedName("hp.ah(Lorg/json/JSONObject;ILea;B)V")
    public void method3338(JSONObject arg0, int arg1, class114 arg2) {
        this.field1950.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field1948 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method3349(var4.getJSONArray("crmcomponents"), this.field1948, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("hp.af(Lorg/json/JSONArray;ILea;I)V")
    public void method3349(JSONArray arg0, int arg1, class114 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class183 var7 = new class183();
                    try {
                        var7.method3328(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field1933.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field1950.put(var9, var7);
                    }
                }
            }
        }
        this.field1950 = this.method3340();
        class318.method3596();
    }

    @ObfuscatedName("hp.at(I)Ljava/util/Map;")
    public Map method3340() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field1950.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class183) ((Entry) var2.get(var4)).getValue()).method3294() > ((class183) ((Entry) var2.get(var4 + 1)).getValue()).method3294()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("hp.an(Ljava/lang/String;I)Lhq;")
    public class183 method3341(String arg0) {
        return (class183) this.field1950.get(arg0);
    }
}
