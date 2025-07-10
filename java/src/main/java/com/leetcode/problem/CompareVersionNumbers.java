package com.leetcode.problem;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        return new VersionNumber(version1).compareTo(new VersionNumber(version2));
    }


    static private class VersionNumber implements Comparable<VersionNumber> {
        private final String versionNumber;

        public VersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
        }

        public String getVersionNumber() {
            return versionNumber;
        }

        @Override
        public int compareTo(VersionNumber o) {
            String[] current = versionNumber.split("\\.");
            String[] other = o.getVersionNumber().split("\\.");
            for (int i = 0; i < Math.max(current.length, other.length); i++) {
                String currentVersion = i >= current.length ? "0": current[i];
                String otherVersion = i >= other.length ? "0": other[i];
                int compare = Integer.compare(Integer.parseInt(currentVersion), Integer.parseInt(otherVersion));
                if (compare != 0) return compare;
            }
            return 0;
        }
    }
}

