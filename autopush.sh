#!/bin/bash

echo "Saving changes..."

git add .

git commit -m "daily update $(date)"

git push

echo "✅ Code pushed to GitHub"
